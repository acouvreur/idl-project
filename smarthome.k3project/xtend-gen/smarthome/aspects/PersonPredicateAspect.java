package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.PersonPredicate;
import smarthome.aspects.PersonAspect;
import smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties;
import smarthome.aspects.PredicateAspect;

@Aspect(className = PersonPredicate.class)
@SuppressWarnings("all")
public class PersonPredicateAspect extends PredicateAspect {
  @Step
  public static boolean eval(final PersonPredicate _self) {
    final smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties _self_ = smarthome.aspects.PersonPredicateAspectPersonPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof smarthome.PersonPredicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.PersonPredicateAspect._privk3_eval(_self_, (smarthome.PersonPredicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "PersonPredicate", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  public static String debug(final PersonPredicate _self) {
    final smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties _self_ = smarthome.aspects.PersonPredicateAspectPersonPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String debug()
    if (_self instanceof smarthome.PersonPredicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.PersonPredicateAspect._privk3_debug(_self_, (smarthome.PersonPredicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "PersonPredicate", "debug");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  private static boolean currentValue(final PersonPredicate _self) {
    final smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties _self_ = smarthome.aspects.PersonPredicateAspectPersonPredicateAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean currentValue()
    if (_self instanceof smarthome.PersonPredicate){
    	result = smarthome.aspects.PersonPredicateAspect._privk3_currentValue(_self_, (smarthome.PersonPredicate)_self);
    };
    return (boolean)result;
  }
  
  private static void currentValue(final PersonPredicate _self, final boolean currentValue) {
    final smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties _self_ = smarthome.aspects.PersonPredicateAspectPersonPredicateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(boolean)
    if (_self instanceof smarthome.PersonPredicate){
    	smarthome.aspects.PersonPredicateAspect._privk3_currentValue(_self_, (smarthome.PersonPredicate)_self,currentValue);
    };
  }
  
  protected static boolean _privk3_eval(final PersonPredicateAspectPersonPredicateAspectProperties _self_, final PersonPredicate _self) {
    PersonPredicateAspect.currentValue(_self, PersonAspect.getCurrentActivity(_self.getPerson()).equals(_self.getActivity()));
    return PersonPredicateAspect.currentValue(_self);
  }
  
  protected static String _privk3_debug(final PersonPredicateAspectPersonPredicateAspectProperties _self_, final PersonPredicate _self) {
    String _name = _self.getPerson().getName();
    String _plus = ("{" + _name);
    String _plus_1 = (_plus + " is ");
    String _literal = _self.getActivity().getLiteral();
    String _plus_2 = (_plus_1 + _literal);
    String _plus_3 = (_plus_2 + " ? ");
    boolean _currentValue = PersonPredicateAspect.currentValue(_self);
    String _plus_4 = (_plus_3 + Boolean.valueOf(_currentValue));
    return (_plus_4 + "}");
  }
  
  protected static boolean _privk3_currentValue(final PersonPredicateAspectPersonPredicateAspectProperties _self_, final PersonPredicate _self) {
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
  
  protected static void _privk3_currentValue(final PersonPredicateAspectPersonPredicateAspectProperties _self_, final PersonPredicate _self, final boolean currentValue) {
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
