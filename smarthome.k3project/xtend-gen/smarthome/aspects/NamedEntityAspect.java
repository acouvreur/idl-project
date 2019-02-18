package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smarthome.NamedEntity;
import smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties;

@Aspect(className = NamedEntity.class)
@SuppressWarnings("all")
public abstract class NamedEntityAspect {
  @Step
  public static void debug(final NamedEntity _self) {
    final smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties _self_ = smarthome.aspects.NamedEntityAspectNamedEntityAspectContext.getSelf(_self);
    	// BeginInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.PersonAspect
    		if (_self instanceof smarthome.Person){
    			smarthome.aspects.PersonAspect.debug((smarthome.Person)_self);
    		} else
    		// EndInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.PersonAspect
    	// BeginInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.SensorAspect
    		if (_self instanceof smarthome.Sensor){
    			smarthome.aspects.SensorAspect.debug((smarthome.Sensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.SensorAspect
    	// BeginInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.PatternAspect
    		if (_self instanceof smarthome.Pattern){
    			smarthome.aspects.PatternAspect.debug((smarthome.Pattern)_self);
    		} else
    		// EndInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.PatternAspect
    	// BeginInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.AnalogSensorAspect
    		if (_self instanceof smarthome.AnalogSensor){
    			smarthome.aspects.AnalogSensorAspect.debug((smarthome.AnalogSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.AnalogSensorAspect
    	// BeginInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.DigitalSensorAspect
    		if (_self instanceof smarthome.DigitalSensor){
    			smarthome.aspects.DigitalSensorAspect.debug((smarthome.DigitalSensor)_self);
    		} else
    		// EndInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.DigitalSensorAspect
    	// BeginInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.RoomAspect
    		if (_self instanceof smarthome.Room){
    			smarthome.aspects.RoomAspect.debug((smarthome.Room)_self);
    		} else
    		// EndInjectInto smarthome.aspects.NamedEntityAspect#void debug() from smarthome.aspects.RoomAspect
    // #DispatchPointCut_before# void debug()
    if (_self instanceof smarthome.NamedEntity){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.NamedEntityAspect._privk3_debug(_self_, (smarthome.NamedEntity)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "NamedEntity", "debug");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static String toString(final NamedEntity _self) {
    final smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties _self_ = smarthome.aspects.NamedEntityAspectNamedEntityAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String toString()
    if (_self instanceof smarthome.NamedEntity){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.NamedEntityAspect._privk3_toString(_self_, (smarthome.NamedEntity)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "NamedEntity", "toString");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  @Step
  public static String getName(final NamedEntity _self) {
    final smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties _self_ = smarthome.aspects.NamedEntityAspectNamedEntityAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getName()
    if (_self instanceof smarthome.NamedEntity){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.NamedEntityAspect._privk3_getName(_self_, (smarthome.NamedEntity)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "NamedEntity", "getName");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_debug(final NamedEntityAspectNamedEntityAspectProperties _self_, final NamedEntity _self) {
    InputOutput.println();
    _self.toString();
  }
  
  protected static String _privk3_toString(final NamedEntityAspectNamedEntityAspectProperties _self_, final NamedEntity _self) {
    String _name = _self.getName();
    return ("name=" + _name);
  }
  
  protected static String _privk3_getName(final NamedEntityAspectNamedEntityAspectProperties _self_, final NamedEntity _self) {
    return _self.getName();
  }
}
