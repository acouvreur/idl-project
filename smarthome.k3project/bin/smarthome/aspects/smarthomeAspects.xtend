package smarthome.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension smarthome.aspects.HomeAspect.*
import static extension smarthome.aspects.NamedEntityAspect.*
import static extension smarthome.aspects.TagAspect.*
import static extension smarthome.aspects.SensorAspect.*
import static extension smarthome.aspects.AnalogSensorAspect.*
import static extension smarthome.aspects.DigitalSensorAspect.*
import static extension smarthome.aspects.CSVSensorAspect.*
import static extension smarthome.aspects.RoomAspect.*
import static extension smarthome.aspects.PatternAspect.*
import static extension smarthome.aspects.RuleAspect.*
import static extension smarthome.aspects.PersonAspect.*
import static extension smarthome.aspects.PredicateAspect.*
import static extension smarthome.aspects.SensorPredicateAspect.*
import static extension smarthome.aspects.PersonPredicateAspect.*
import static extension smarthome.aspects.DurationAspect.*
import smarthome.Home
import smarthome.NamedEntity
import smarthome.Sensor
import smarthome.AnalogSensor
import smarthome.DigitalSensor
import smarthome.CSVSensor
import smarthome.Room
import smarthome.Pattern
import smarthome.Rule
import smarthome.Tag
import smarthome.Person
import smarthome.Predicate
import smarthome.SensorPredicate
import smarthome.PersonPredicate
import smarthome.Duration
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import smarthome.Activity
import smarthome.Operator
import java.io.File
import java.io.BufferedReader
import java.io.FileReader
import java.text.SimpleDateFormat
import java.sql.Timestamp

@Aspect(className=Home)
class HomeAspect {
	
	BufferedReader br
	String currentString
	String nextString
	int count
	long initialTime
	long currentTime
	
	SimpleDateFormat datetimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
	
	
	@Main
	def void doIt() {
		
		// Definition
    	_self.br = new BufferedReader(new FileReader(new File(_self.fileEvents)))
    	_self.currentString = _self.br.readLine()
    	
    	val parsedString = _self.currentString.split(",")

		_self.initialTime = _self.getMillisFromStringDate(parsedString.get(0))
    
		for(Room r : _self.rooms) {
			r.init()
		}
		
		for(Person p : _self.persons) {
			p.init()
		}
		
		for(Pattern p : _self.patterns) {
			p.init(_self.initialTime)
		}
		
		_self.count = 0
		while(_self.currentString !== null) {
			
			_self.tick(_self.count)
			
			_self.count = _self.count + 1
		}
		
		println("--END--")
	}
	
	@Step
	def void tick(int count) {
		
		println("Iteration " + count)
		
		val parsedString = _self.currentString.split(",")
		
		if(parsedString.length <= 2) {
			println("Error parsing")
			return
		}
		
		_self.currentTime = _self.getMillisFromStringDate(parsedString.get(0))
		
		for(Room r : _self.rooms) {
			r.tick()
			if(parsedString.get(1).equalsIgnoreCase(r.name)) {
				for(Sensor s : r.sensors) {
					if(parsedString.get(2).equalsIgnoreCase(s.name)) {
						s.value = Double.valueOf(parsedString.get(3))
					}
				}
			}
		}

		for(Person p : _self.persons) {
			p.tick()
			if(parsedString.get(1).equalsIgnoreCase(p.name)) {

				// We only need y value :)
				p.chest.y = Double.valueOf(parsedString.get(2))
				p.belt.y = Double.valueOf(parsedString.get(3))
				p.ankleLeft.y = Double.valueOf(parsedString.get(4))
				p.ankleRight.y = Double.valueOf(parsedString.get(5))
				
			}
		}

		for(Pattern p : _self.patterns) {
			if(p.eval(_self.currentTime))
				p.exec()
		}
		
		println("Monitoring")
		println("Current timestamp:" + _self.currentTime)
		println("Current timestamp elapsed(seconds):" + ((_self.currentTime - _self.initialTime) / 1000))
		for(NamedEntity n : _self.monitoredEntities) {
			println("--------"+ n.name + "--------")
			n.debug()
			println("---------------------")
		}
		
		_self.currentString = _self.br.readLine()
	}
	
	def long getMillisFromStringDate(String str) {
		return new Timestamp(_self.datetimeFormatter.parse(str).getTime()).time
	}
	
	
}

@Aspect(className=NamedEntity)
abstract class NamedEntityAspect {

	@Step
	def void debug() {
		println _self.toString()
	}
	
	@Step
	def String toString() {
		return "name=" + _self.name
	}
	
	@Step
	def String getName() {
		return _self.name
	}
	
	/*
	@Step
	def void setName(String name) {
		_self.name = name
	}*/
}

@Aspect(className=Sensor)
abstract class SensorAspect extends NamedEntityAspect {

	protected Double currentValue = 0.0
	
	@Step
	abstract def void tick()
	
	@Step
	abstract def void init()
	
	@Step
	def void debug() {
		println("Sensor[" + _self.name + "] = " + _self.currentValue)
	}
	
	/*@Step
	def String toString() {
		return "Sensor[" + _self.name + "] = " + _self.currentValue
	}*/
	
	@Step
	def void setValue(Double value) {
		_self.currentValue = value
	}
	
	@Step
	def void readSource() {
		
	}
	
}

@Aspect(className=AnalogSensor)
class AnalogSensorAspect extends SensorAspect {

	
	@Step
	def void tick() {
		// TODO: fetch data from sensor ?
		// instead of main func
	}
	
	@Step
	def void init() {
		
	}
	
	@Step
	def void debug() {
		println("AnalogSensor[" + _self.name + "] = " + _self.currentValue)
	}
}

@Aspect(className=DigitalSensor)
class DigitalSensorAspect extends SensorAspect {
	
	@Step
	def void tick() {
		// TODO: fetch data from sensor ?
		// instead of main func
	}
	
	@Step
	def void init() {
		
	}
	
	@Step
	def void debug() {
		println("DigitalSensor[" + _self.name + "] = " + _self.currentValue)
	}
}

@Aspect(className=CSVSensor)
class CSVSensorAspect {

	// TODO: load file
	// No need because event file
	
}

@Aspect(className=Room)
class RoomAspect extends NamedEntityAspect {

	@Step
	def void init() {
		for(Sensor s : _self.sensors) {
			s.init()
		}
	}
	
	@Step
	def void tick() {
		for(Sensor s : _self.sensors) {
			s.tick()
		}
	}
	
	@Step
	def void debug() {
		
		println "Room[" + _self.name + "]{"
		for(Sensor s : _self.sensors) {
			print("-> ")
			s.debug()
		}
		println("}")
	}
	
}

@Aspect(className=Pattern)
class PatternAspect extends NamedEntityAspect {

	@Step
	def void init(long initialTime) {
		for(Rule r : _self.rules) {
			r.init(initialTime)
		}
	}
	
	@Step
	def boolean eval(long currentTime) {
		
		for(Rule r : _self.rules) {
			if(! r.eval(currentTime)) {
				return false
			}
		}
		
		return true
	}
	
	@Step
	def void debug() {
		
		println("Pattern[" + _self.name + "]{")
		for(Rule r : _self.rules) {
			println(r.debug())
		}
		println("}")
	}
	
	
	@Step
	def void exec() {
		println("Pattern[" + _self.name + "] append !")
	}
	
}

@Aspect(className=Rule)
class RuleAspect {
	
	@Step
	def void init(long initialTime) {
		if(_self.duration !== null) {
			_self.duration.init(initialTime)
		}
	}

	@Step
	def boolean eval(long currentTime) {
		
		// Evaluate all the predicates
		for(Predicate p : _self.predicates) {
			if(! p.eval()) {
				
				// Has a @Step so easy to debug
				_self.duration.reset(currentTime)
				
				return false
			}
		}
		
		return _self.duration.isDone(currentTime)
	}
	
	@Step
	def String debug() {
		
		var sb = new StringBuilder()
		for(Predicate p : _self.predicates) {
			sb.append(p.debug()).append("\n")
		}
		
		if(_self.duration !== null) {
			sb.append(_self.duration.debug())
		}
		return sb.toString()
	}
}

@Aspect(className=Tag)
class TagAspect extends NamedEntityAspect {
	
	public Double x = 0.0
	public Double y = 0.0
	public Double z = 0.0
	
	@Step
	def void tick() {
		
	}
	
	def String debug() {
		// return "[" + _self.name + "]{x=" + _self.x + ", y=" + _self.y + ", z=" + _self.z + "}"
		return "[" + _self.name + "]{y=" + _self.y + "}"
 	} 
	 
	
}

@Aspect(className=Person)
class PersonAspect extends NamedEntityAspect {
	
	Activity currentActivity
	
	final double STANDING_RATIO = 1.8
	final double SITTING_RATIO = 1.0
	final double LAYING_RATIO = 0.0
	final double DELTA = 0.4
	
	@Step
	def void tick(){
		_self.determineActivity()
	} 
	
	@Step
	def void init() {
		_self.currentActivity = Activity.LAYING
	}
	
	def void determineActivity() {
		
		// TODO: Determine activity based on chest belt ankles
		//_self.currentActivity = Activity.STANDING
		
		val cy = _self.chest.y
		val by = _self.belt.y
		val cb = cy - by;
		
		val aly = _self.ankleLeft.y
		val ary = _self.ankleRight.y
		val ba = ( by - ((aly + ary) / 2))
	
		if( ba / cb > _self.STANDING_RATIO)
			_self.currentActivity = Activity.STANDING
		
		else if(ba / cb > _self.SITTING_RATIO) 
			_self.currentActivity = Activity.SITTING
			
		else _self.currentActivity = Activity.LAYING
		
	}

	def Activity getCurrentActivity() {
		return _self.currentActivity()
	}
	
	@Step
	def void debug() {
		
		println ("Person[" + _self.name + "]{")
		// TODO: print all tags and current activity
		println ("-" + _self.chest.debug())
		println ("-" + _self.belt.debug())
		println ("-" + _self.ankleLeft.debug())
		println ("-" + _self.ankleRight.debug())
		println ("-" + _self.getCurrentActivity().getName())
		println("}")
	}

}

@Aspect(className=Predicate)
abstract class PredicateAspect {
	
	@Step
	abstract def void init(long initialTime)
	
	@Step
	abstract def boolean eval()
	
	@Step
	abstract def String debug()
}

@Aspect(className=SensorPredicate)
class SensorPredicateAspect extends PredicateAspect {

	boolean currentValue = false
	
	
	
	@Step
	def boolean eval() {
		switch(_self.operator) {
			case Operator.EQUAL: {
					_self.currentValue = _self.sensor.currentValue == _self.value
					return _self.currentValue
				} 
			case Operator.SUPERIOR: {
					_self.currentValue = _self.sensor.currentValue > _self.value
					return _self.currentValue 
				}
			case Operator.INFERIOR: {
					_self.currentValue = _self.sensor.currentValue < _self.value
					return _self.currentValue 
				}
		}
		_self.currentValue = false
		return _self.currentValue
	}
	
	@Step
	def String debug() {
		return "{" + _self.sensor.name + " " + _self.operator.literal + " " + _self.value + " ? " + _self.currentValue + "}"
	}
		
}

@Aspect(className=PersonPredicate)
class PersonPredicateAspect extends PredicateAspect {
	
	boolean currentValue = false
	
	@Step
	def boolean eval() {
		_self.currentValue = _self.person.getCurrentActivity().equals(_self.activity)
		return _self.currentValue
	}
	
	@Step
	def String debug() {
		
		return "{" + _self.person.name+ " is " + _self.activity.literal + " ? " + _self.currentValue + "}"

	}
	
}

@Aspect(className=Duration)
class DurationAspect {

	long validSince
	boolean currentValue = false
	
	@Step
	def void init(long initialTime) {
		_self.validSince = initialTime
	}
	
	@Step
	def void reset(long currentTime) {
		_self.validSince = currentTime
	}
	
	@Step
	def boolean isDone(long currentTime) {
		_self.currentValue = (currentTime - _self.validSince) > (_self.time * _self.precision.value)
		return _self.currentValue
	}
	
	@Step
	def String debug() {
		
		return "{validSince:" + _self.validSince + ", duration:" + _self.time + _self.precision.literal + ", valid: " + _self.currentValue + "}"

	}
}



