package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smarthome.AnalogSensor;
import smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties;
import smarthome.aspects.SensorAspect;

@Aspect(className = AnalogSensor.class)
@SuppressWarnings("all")
public class AnalogSensorAspect extends SensorAspect {
  @Step
  public static void tick(final AnalogSensor _self) {
    final smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties _self_ = smarthome.aspects.AnalogSensorAspectAnalogSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tick()
    if (_self instanceof smarthome.AnalogSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.AnalogSensorAspect._privk3_tick(_self_, (smarthome.AnalogSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "AnalogSensor", "tick");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void init(final AnalogSensor _self) {
    final smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties _self_ = smarthome.aspects.AnalogSensorAspectAnalogSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void init()
    if (_self instanceof smarthome.AnalogSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.AnalogSensorAspect._privk3_init(_self_, (smarthome.AnalogSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "AnalogSensor", "init");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void debug(final AnalogSensor _self) {
    final smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties _self_ = smarthome.aspects.AnalogSensorAspectAnalogSensorAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void debug()
    if (_self instanceof smarthome.AnalogSensor){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.AnalogSensorAspect._privk3_debug(_self_, (smarthome.AnalogSensor)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "AnalogSensor", "debug");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_tick(final AnalogSensorAspectAnalogSensorAspectProperties _self_, final AnalogSensor _self) {
  }
  
  protected static void _privk3_init(final AnalogSensorAspectAnalogSensorAspectProperties _self_, final AnalogSensor _self) {
  }
  
  protected static void _privk3_debug(final AnalogSensorAspectAnalogSensorAspectProperties _self_, final AnalogSensor _self) {
    String _name = _self.getName();
    String _plus = ("AnalogSensor[" + _name);
    String _plus_1 = (_plus + "] = ");
    Double _currentValue = SensorAspect.currentValue(_self);
    String _plus_2 = (_plus_1 + _currentValue);
    InputOutput.<String>println(_plus_2);
  }
}
