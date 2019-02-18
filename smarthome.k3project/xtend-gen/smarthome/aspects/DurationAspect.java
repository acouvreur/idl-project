package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Duration;
import smarthome.aspects.DurationAspectDurationAspectProperties;

@Aspect(className = Duration.class)
@SuppressWarnings("all")
public class DurationAspect {
  @Step
  public static void init(final Duration _self, final long initialTime) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void init(long)
    if (_self instanceof smarthome.Duration){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.DurationAspect._privk3_init(_self_, (smarthome.Duration)_self,initialTime);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {initialTime}, command, "Duration", "init");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void reset(final Duration _self, final long currentTime) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void reset(long)
    if (_self instanceof smarthome.Duration){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.DurationAspect._privk3_reset(_self_, (smarthome.Duration)_self,currentTime);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {currentTime}, command, "Duration", "reset");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static boolean isDone(final Duration _self, final long currentTime) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isDone(long)
    if (_self instanceof smarthome.Duration){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.DurationAspect._privk3_isDone(_self_, (smarthome.Duration)_self,currentTime));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {currentTime}, command, "Duration", "isDone");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  public static String debug(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String debug()
    if (_self instanceof smarthome.Duration){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.DurationAspect._privk3_debug(_self_, (smarthome.Duration)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Duration", "debug");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  private static long validSince(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# long validSince()
    if (_self instanceof smarthome.Duration){
    	result = smarthome.aspects.DurationAspect._privk3_validSince(_self_, (smarthome.Duration)_self);
    };
    return (long)result;
  }
  
  private static void validSince(final Duration _self, final long validSince) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void validSince(long)
    if (_self instanceof smarthome.Duration){
    	smarthome.aspects.DurationAspect._privk3_validSince(_self_, (smarthome.Duration)_self,validSince);
    };
  }
  
  private static boolean currentValue(final Duration _self) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean currentValue()
    if (_self instanceof smarthome.Duration){
    	result = smarthome.aspects.DurationAspect._privk3_currentValue(_self_, (smarthome.Duration)_self);
    };
    return (boolean)result;
  }
  
  private static void currentValue(final Duration _self, final boolean currentValue) {
    final smarthome.aspects.DurationAspectDurationAspectProperties _self_ = smarthome.aspects.DurationAspectDurationAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentValue(boolean)
    if (_self instanceof smarthome.Duration){
    	smarthome.aspects.DurationAspect._privk3_currentValue(_self_, (smarthome.Duration)_self,currentValue);
    };
  }
  
  protected static void _privk3_init(final DurationAspectDurationAspectProperties _self_, final Duration _self, final long initialTime) {
    DurationAspect.validSince(_self, initialTime);
  }
  
  protected static void _privk3_reset(final DurationAspectDurationAspectProperties _self_, final Duration _self, final long currentTime) {
    DurationAspect.validSince(_self, currentTime);
  }
  
  protected static boolean _privk3_isDone(final DurationAspectDurationAspectProperties _self_, final Duration _self, final long currentTime) {
    long _validSince = DurationAspect.validSince(_self);
    long _minus = (currentTime - _validSince);
    int _time = _self.getTime();
    int _value = _self.getPrecision().getValue();
    int _multiply = (_time * _value);
    boolean _greaterThan = (_minus > _multiply);
    DurationAspect.currentValue(_self, _greaterThan);
    return DurationAspect.currentValue(_self);
  }
  
  protected static String _privk3_debug(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    long _validSince = DurationAspect.validSince(_self);
    String _plus = ("{validSince:" + Long.valueOf(_validSince));
    String _plus_1 = (_plus + ", duration:");
    int _time = _self.getTime();
    String _plus_2 = (_plus_1 + Integer.valueOf(_time));
    String _literal = _self.getPrecision().getLiteral();
    String _plus_3 = (_plus_2 + _literal);
    String _plus_4 = (_plus_3 + ", valid: ");
    boolean _currentValue = DurationAspect.currentValue(_self);
    String _plus_5 = (_plus_4 + Boolean.valueOf(_currentValue));
    return (_plus_5 + "}");
  }
  
  protected static long _privk3_validSince(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getValidSince") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.validSince;
  }
  
  protected static void _privk3_validSince(final DurationAspectDurationAspectProperties _self_, final Duration _self, final long validSince) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setValidSince")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, validSince);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.validSince = validSince;
    }
  }
  
  protected static boolean _privk3_currentValue(final DurationAspectDurationAspectProperties _self_, final Duration _self) {
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
  
  protected static void _privk3_currentValue(final DurationAspectDurationAspectProperties _self_, final Duration _self, final boolean currentValue) {
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
