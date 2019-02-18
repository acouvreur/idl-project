package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import smarthome.Tag;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.TagAspectTagAspectProperties;

@Aspect(className = Tag.class)
@SuppressWarnings("all")
public class TagAspect extends NamedEntityAspect {
  @Step
  public static void tick(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tick()
    if (_self instanceof smarthome.Tag){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.TagAspect._privk3_tick(_self_, (smarthome.Tag)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Tag", "tick");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static String debug(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String debug()
    if (_self instanceof smarthome.Tag){
    	result = smarthome.aspects.TagAspect._privk3_debug(_self_, (smarthome.Tag)_self);
    };
    return (java.lang.String)result;
  }
  
  public static Double x(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Double x()
    if (_self instanceof smarthome.Tag){
    	result = smarthome.aspects.TagAspect._privk3_x(_self_, (smarthome.Tag)_self);
    };
    return (java.lang.Double)result;
  }
  
  public static void x(final Tag _self, final Double x) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void x(Double)
    if (_self instanceof smarthome.Tag){
    	smarthome.aspects.TagAspect._privk3_x(_self_, (smarthome.Tag)_self,x);
    };
  }
  
  public static Double y(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Double y()
    if (_self instanceof smarthome.Tag){
    	result = smarthome.aspects.TagAspect._privk3_y(_self_, (smarthome.Tag)_self);
    };
    return (java.lang.Double)result;
  }
  
  public static void y(final Tag _self, final Double y) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void y(Double)
    if (_self instanceof smarthome.Tag){
    	smarthome.aspects.TagAspect._privk3_y(_self_, (smarthome.Tag)_self,y);
    };
  }
  
  public static Double z(final Tag _self) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Double z()
    if (_self instanceof smarthome.Tag){
    	result = smarthome.aspects.TagAspect._privk3_z(_self_, (smarthome.Tag)_self);
    };
    return (java.lang.Double)result;
  }
  
  public static void z(final Tag _self, final Double z) {
    final smarthome.aspects.TagAspectTagAspectProperties _self_ = smarthome.aspects.TagAspectTagAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void z(Double)
    if (_self instanceof smarthome.Tag){
    	smarthome.aspects.TagAspect._privk3_z(_self_, (smarthome.Tag)_self,z);
    };
  }
  
  protected static void _privk3_tick(final TagAspectTagAspectProperties _self_, final Tag _self) {
  }
  
  protected static String _privk3_debug(final TagAspectTagAspectProperties _self_, final Tag _self) {
    String _name = _self.getName();
    String _plus = ("[" + _name);
    String _plus_1 = (_plus + "]{y=");
    Double _y = TagAspect.y(_self);
    String _plus_2 = (_plus_1 + _y);
    return (_plus_2 + "}");
  }
  
  protected static Double _privk3_x(final TagAspectTagAspectProperties _self_, final Tag _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getX") &&
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
    return _self_.x;
  }
  
  protected static void _privk3_x(final TagAspectTagAspectProperties _self_, final Tag _self, final Double x) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setX")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, x);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.x = x;
    }
  }
  
  protected static Double _privk3_y(final TagAspectTagAspectProperties _self_, final Tag _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getY") &&
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
    return _self_.y;
  }
  
  protected static void _privk3_y(final TagAspectTagAspectProperties _self_, final Tag _self, final Double y) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setY")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, y);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.y = y;
    }
  }
  
  protected static Double _privk3_z(final TagAspectTagAspectProperties _self_, final Tag _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getZ") &&
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
    return _self_.z;
  }
  
  protected static void _privk3_z(final TagAspectTagAspectProperties _self_, final Tag _self, final Double z) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setZ")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, z);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.z = z;
    }
  }
}
