package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smarthome.Sensor;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.SensorAspectSensorAspectProperties;

@Aspect(className = Sensor.class)
@SuppressWarnings("all")
public abstract class SensorAspect extends NamedEntityAspect {
  @Step
  @Abstract
  public static void tick(final Sensor _self) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    	// BeginInjectInto smarthome.aspects.SensorAspect#void tick() from smarthome.aspects.DigitalSensorAspect
    		if (_self instanceof smarthome.DigitalSensor){
    			smarthome.aspects.DigitalSensorAspect.tick((smarthome.DigitalSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.SensorAspect#void tick() from smarthome.aspects.DigitalSensorAspect
    	// BeginInjectInto smarthome.aspects.SensorAspect#void tick() from smarthome.aspects.AnalogSensorAspect
    		if (_self instanceof smarthome.AnalogSensor){
    			smarthome.aspects.AnalogSensorAspect.tick((smarthome.AnalogSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.SensorAspect#void tick() from smarthome.aspects.AnalogSensorAspect
    // #DispatchPointCut_before# void tick()
    if (_self instanceof smarthome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.SensorAspect._privk3_tick(_self_, (smarthome.Sensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "tick");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  @Abstract
  public static void init(final Sensor _self) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    	// BeginInjectInto smarthome.aspects.SensorAspect#void init() from smarthome.aspects.DigitalSensorAspect
    		if (_self instanceof smarthome.DigitalSensor){
    			smarthome.aspects.DigitalSensorAspect.init((smarthome.DigitalSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.SensorAspect#void init() from smarthome.aspects.DigitalSensorAspect
    	// BeginInjectInto smarthome.aspects.SensorAspect#void init() from smarthome.aspects.AnalogSensorAspect
    		if (_self instanceof smarthome.AnalogSensor){
    			smarthome.aspects.AnalogSensorAspect.init((smarthome.AnalogSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.SensorAspect#void init() from smarthome.aspects.AnalogSensorAspect
    // #DispatchPointCut_before# void init()
    if (_self instanceof smarthome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.SensorAspect._privk3_init(_self_, (smarthome.Sensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "init");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void debug(final Sensor _self) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    	// BeginInjectInto smarthome.aspects.SensorAspect#void debug() from smarthome.aspects.AnalogSensorAspect
    		if (_self instanceof smarthome.AnalogSensor){
    			smarthome.aspects.AnalogSensorAspect.debug((smarthome.AnalogSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.SensorAspect#void debug() from smarthome.aspects.AnalogSensorAspect
    	// BeginInjectInto smarthome.aspects.SensorAspect#void debug() from smarthome.aspects.DigitalSensorAspect
    		if (_self instanceof smarthome.DigitalSensor){
    			smarthome.aspects.DigitalSensorAspect.debug((smarthome.DigitalSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.SensorAspect#void debug() from smarthome.aspects.DigitalSensorAspect
    // #DispatchPointCut_before# void debug()
    if (_self instanceof smarthome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.SensorAspect._privk3_debug(_self_, (smarthome.Sensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "debug");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  /**
   * @Step
   * def String toString() {
   * return "Sensor[" + _self.name + "] = " + _self.currentValue
   * }
   */
  @Step
  public static void setValue(final Sensor _self, final Double value) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void setValue(Double)
    if (_self instanceof smarthome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.SensorAspect._privk3_setValue(_self_, (smarthome.Sensor)_self,value);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {value}, command, "Sensor", "setValue");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void readSource(final Sensor _self) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void readSource()
    if (_self instanceof smarthome.Sensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.SensorAspect._privk3_readSource(_self_, (smarthome.Sensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Sensor", "readSource");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static Double currentValue(final Sensor _self) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Double currentValue()
    if (_self instanceof smarthome.Sensor){
    	result = smarthome.aspects.SensorAspect._privk3_currentValue(_self_, (smarthome.Sensor)_self);
    };
    return (java.lang.Double)result;
  }
  
  protected static void currentValue(final Sensor _self, final Double currentValue) {
    final smarthome.aspects.SensorAspectSensorAspectProperties _self_ = smarthome.aspects.SensorAspectSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(Double)
    if (_self instanceof smarthome.Sensor){
    	smarthome.aspects.SensorAspect._privk3_currentValue(_self_, (smarthome.Sensor)_self,currentValue);
    };
  }
  
  protected static void _privk3_tick(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_init(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static void _privk3_debug(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    String _name = _self.getName();
    String _plus = ("Sensor[" + _name);
    String _plus_1 = (_plus + "] = ");
    Double _currentValue = SensorAspect.currentValue(_self);
    String _plus_2 = (_plus_1 + _currentValue);
    InputOutput.<String>println(_plus_2);
  }
  
  protected static void _privk3_setValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final Double value) {
    SensorAspect.currentValue(_self, value);
  }
  
  protected static void _privk3_readSource(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
  }
  
  protected static Double _privk3_currentValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.Double) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final SensorAspectSensorAspectProperties _self_, final Sensor _self, final Double currentValue) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentValue")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentValue);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentValue = currentValue;
    }
  }
}
