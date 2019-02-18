package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Predicate;
import smarthome.aspects.PredicateAspectPredicateAspectProperties;

@Aspect(className = Predicate.class)
@SuppressWarnings("all")
public abstract class PredicateAspect {
  @Step
  @Abstract
  public static void init(final Predicate _self, final long initialTime) {
    final smarthome.aspects.PredicateAspectPredicateAspectProperties _self_ = smarthome.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void init(long)
    if (_self instanceof smarthome.Predicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.PredicateAspect._privk3_init(_self_, (smarthome.Predicate)_self,initialTime);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {initialTime}, command, "Predicate", "init");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  @Abstract
  public static boolean eval(final Predicate _self) {
    final smarthome.aspects.PredicateAspectPredicateAspectProperties _self_ = smarthome.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto smarthome.aspects.PredicateAspect#boolean eval() from smarthome.aspects.SensorPredicateAspect
    		if (_self instanceof smarthome.SensorPredicate){
    			result = smarthome.aspects.SensorPredicateAspect.eval((smarthome.SensorPredicate)_self);
    		} else
    		// EndInjectInto smarthome.aspects.PredicateAspect#boolean eval() from smarthome.aspects.SensorPredicateAspect
    	// BeginInjectInto smarthome.aspects.PredicateAspect#boolean eval() from smarthome.aspects.PersonPredicateAspect
    		if (_self instanceof smarthome.PersonPredicate){
    			result = smarthome.aspects.PersonPredicateAspect.eval((smarthome.PersonPredicate)_self);
    		} else
    		// EndInjectInto smarthome.aspects.PredicateAspect#boolean eval() from smarthome.aspects.PersonPredicateAspect
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof smarthome.Predicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.PredicateAspect._privk3_eval(_self_, (smarthome.Predicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Predicate", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  @Abstract
  public static String debug(final Predicate _self) {
    final smarthome.aspects.PredicateAspectPredicateAspectProperties _self_ = smarthome.aspects.PredicateAspectPredicateAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto smarthome.aspects.PredicateAspect#String debug() from smarthome.aspects.SensorPredicateAspect
    		if (_self instanceof smarthome.SensorPredicate){
    			result = smarthome.aspects.SensorPredicateAspect.debug((smarthome.SensorPredicate)_self);
    		} else
    		// EndInjectInto smarthome.aspects.PredicateAspect#String debug() from smarthome.aspects.SensorPredicateAspect
    	// BeginInjectInto smarthome.aspects.PredicateAspect#String debug() from smarthome.aspects.PersonPredicateAspect
    		if (_self instanceof smarthome.PersonPredicate){
    			result = smarthome.aspects.PersonPredicateAspect.debug((smarthome.PersonPredicate)_self);
    		} else
    		// EndInjectInto smarthome.aspects.PredicateAspect#String debug() from smarthome.aspects.PersonPredicateAspect
    // #DispatchPointCut_before# String debug()
    if (_self instanceof smarthome.Predicate){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.PredicateAspect._privk3_debug(_self_, (smarthome.Predicate)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Predicate", "debug");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_init(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self, final long initialTime) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static boolean _privk3_eval(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static String _privk3_debug(final PredicateAspectPredicateAspectProperties _self_, final Predicate _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
