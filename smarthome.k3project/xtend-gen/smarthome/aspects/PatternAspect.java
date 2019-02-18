package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smarthome.Pattern;
import smarthome.Rule;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.PatternAspectPatternAspectProperties;
import smarthome.aspects.RuleAspect;

@Aspect(className = Pattern.class)
@SuppressWarnings("all")
public class PatternAspect extends NamedEntityAspect {
  @Step
  public static void init(final Pattern _self, final long initialTime) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void init(long)
    if (_self instanceof smarthome.Pattern){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.PatternAspect._privk3_init(_self_, (smarthome.Pattern)_self,initialTime);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {initialTime}, command, "Pattern", "init");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static boolean eval(final Pattern _self, final long currentTime) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval(long)
    if (_self instanceof smarthome.Pattern){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(smarthome.aspects.PatternAspect._privk3_eval(_self_, (smarthome.Pattern)_self,currentTime));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {currentTime}, command, "Pattern", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  @Step
  public static void debug(final Pattern _self) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void debug()
    if (_self instanceof smarthome.Pattern){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.PatternAspect._privk3_debug(_self_, (smarthome.Pattern)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Pattern", "debug");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  @Step
  public static void exec(final Pattern _self) {
    final smarthome.aspects.PatternAspectPatternAspectProperties _self_ = smarthome.aspects.PatternAspectPatternAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof smarthome.Pattern){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.PatternAspect._privk3_exec(_self_, (smarthome.Pattern)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Pattern", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_init(final PatternAspectPatternAspectProperties _self_, final Pattern _self, final long initialTime) {
    EList<Rule> _rules = _self.getRules();
    for (final Rule r : _rules) {
      RuleAspect.init(r, initialTime);
    }
  }
  
  protected static boolean _privk3_eval(final PatternAspectPatternAspectProperties _self_, final Pattern _self, final long currentTime) {
    EList<Rule> _rules = _self.getRules();
    for (final Rule r : _rules) {
      boolean _eval = RuleAspect.eval(r, currentTime);
      boolean _not = (!_eval);
      if (_not) {
        return false;
      }
    }
    return true;
  }
  
  protected static void _privk3_debug(final PatternAspectPatternAspectProperties _self_, final Pattern _self) {
    String _name = _self.getName();
    String _plus = ("Pattern[" + _name);
    String _plus_1 = (_plus + "]{");
    InputOutput.<String>println(_plus_1);
    EList<Rule> _rules = _self.getRules();
    for (final Rule r : _rules) {
      InputOutput.<String>println(RuleAspect.debug(r));
    }
    InputOutput.<String>println("}");
  }
  
  protected static void _privk3_exec(final PatternAspectPatternAspectProperties _self_, final Pattern _self) {
    String _name = _self.getName();
    String _plus = ("Pattern[" + _name);
    String _plus_1 = (_plus + "] append !");
    InputOutput.<String>println(_plus_1);
  }
}
