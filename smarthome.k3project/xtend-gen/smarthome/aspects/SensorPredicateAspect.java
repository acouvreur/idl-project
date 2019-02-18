package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Operator;
import smarthome.SensorPredicate;
import smarthome.aspects.PredicateAspect;
import smarthome.aspects.SensorAspect;
import smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties;

@Aspect(className = SensorPredicate.class)
@SuppressWarnings("all")
public class SensorPredicateAspect extends PredicateAspect {
  @Step
  public static boolean eval(final SensorPredicate _self) {
    final smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties _self_ = smarthome.aspects.SensorPredicateAspectSensorPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof smarthome.SensorPredicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.SensorPredicateAspect._privk3_eval(_self_, (smarthome.SensorPredicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "SensorPredicate", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  public static String debug(final SensorPredicate _self) {
    final smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties _self_ = smarthome.aspects.SensorPredicateAspectSensorPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String debug()
    if (_self instanceof smarthome.SensorPredicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.SensorPredicateAspect._privk3_debug(_self_, (smarthome.SensorPredicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "SensorPredicate", "debug");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  private static boolean currentValue(final SensorPredicate _self) {
    final smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties _self_ = smarthome.aspects.SensorPredicateAspectSensorPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean currentValue()
    if (_self instanceof smarthome.SensorPredicate){
    	result = smarthome.aspects.SensorPredicateAspect._privk3_currentValue(_self_, (smarthome.SensorPredicate)_self);
    };
    return (boolean)result;
  }
  
  private static void currentValue(final SensorPredicate _self, final boolean currentValue) {
    final smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties _self_ = smarthome.aspects.SensorPredicateAspectSensorPredicateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(boolean)
    if (_self instanceof smarthome.SensorPredicate){
    	smarthome.aspects.SensorPredicateAspect._privk3_currentValue(_self_, (smarthome.SensorPredicate)_self,currentValue);
    };
  }
  
  protected static boolean _privk3_eval(final SensorPredicateAspectSensorPredicateAspectProperties _self_, final SensorPredicate _self) {
    Operator _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case EQUAL:
          Double _currentValue = SensorAspect.currentValue(_self.getSensor());
          double _value = _self.getValue();
          boolean _equals = ((_currentValue).doubleValue() == _value);
          SensorPredicateAspect.currentValue(_self, _equals);
          return SensorPredicateAspect.currentValue(_self);
        case SUPERIOR:
          Double _currentValue_1 = SensorAspect.currentValue(_self.getSensor());
          double _value_1 = _self.getValue();
          boolean _greaterThan = ((_currentValue_1).doubleValue() > _value_1);
          SensorPredicateAspect.currentValue(_self, _greaterThan);
          return SensorPredicateAspect.currentValue(_self);
        case INFERIOR:
          Double _currentValue_2 = SensorAspect.currentValue(_self.getSensor());
          double _value_2 = _self.getValue();
          boolean _lessThan = ((_currentValue_2).doubleValue() < _value_2);
          SensorPredicateAspect.currentValue(_self, _lessThan);
          return SensorPredicateAspect.currentValue(_self);
        default:
          break;
      }
    }
    SensorPredicateAspect.currentValue(_self, false);
    return SensorPredicateAspect.currentValue(_self);
  }
  
  protected static String _privk3_debug(final SensorPredicateAspectSensorPredicateAspectProperties _self_, final SensorPredicate _self) {
    String _name = _self.getSensor().getName();
    String _plus = ("{" + _name);
    String _plus_1 = (_plus + " ");
    String _literal = _self.getOperator().getLiteral();
    String _plus_2 = (_plus_1 + _literal);
    String _plus_3 = (_plus_2 + " ");
    double _value = _self.getValue();
    String _plus_4 = (_plus_3 + Double.valueOf(_value));
    String _plus_5 = (_plus_4 + " ? ");
    boolean _currentValue = SensorPredicateAspect.currentValue(_self);
    String _plus_6 = (_plus_5 + Boolean.valueOf(_currentValue));
    return (_plus_6 + "}");
  }
  
  protected static boolean _privk3_currentValue(final SensorPredicateAspectSensorPredicateAspectProperties _self_, final SensorPredicate _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isCurrentValue") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentValue;
  }
  
  protected static void _privk3_currentValue(final SensorPredicateAspectSensorPredicateAspectProperties _self_, final SensorPredicate _self, final boolean currentValue) {
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
