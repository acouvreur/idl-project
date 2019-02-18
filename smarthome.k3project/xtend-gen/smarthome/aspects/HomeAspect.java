package smarthome.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import smarthome.Home;
import smarthome.NamedEntity;
import smarthome.Pattern;
import smarthome.Person;
import smarthome.Room;
import smarthome.Sensor;
import smarthome.Tag;
import smarthome.aspects.HomeAspectHomeAspectProperties;
import smarthome.aspects.NamedEntityAspect;
import smarthome.aspects.PatternAspect;
import smarthome.aspects.PersonAspect;
import smarthome.aspects.RoomAspect;
import smarthome.aspects.SensorAspect;
import smarthome.aspects.TagAspect;

@Aspect(className = Home.class)
@SuppressWarnings("all")
public class HomeAspect {
  @Main
  public static void doIt(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void doIt()
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_doIt(_self_, (smarthome.Home)_self);
    };
  }
  
  @Step
  public static void tick(final Home _self, final int count) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void tick(int)
    if (_self instanceof smarthome.Home){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			smarthome.aspects.HomeAspect._privk3_tick(_self_, (smarthome.Home)_self,count);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {count}, command, "Home", "tick");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  public static long getMillisFromStringDate(final Home _self, final String str) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# long getMillisFromStringDate(String)
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_getMillisFromStringDate(_self_, (smarthome.Home)_self,str);
    };
    return (long)result;
  }
  
  private static BufferedReader br(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# BufferedReader br()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_br(_self_, (smarthome.Home)_self);
    };
    return (java.io.BufferedReader)result;
  }
  
  private static void br(final Home _self, final BufferedReader br) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void br(BufferedReader)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_br(_self_, (smarthome.Home)_self,br);
    };
  }
  
  private static String currentString(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String currentString()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_currentString(_self_, (smarthome.Home)_self);
    };
    return (java.lang.String)result;
  }
  
  private static void currentString(final Home _self, final String currentString) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentString(String)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_currentString(_self_, (smarthome.Home)_self,currentString);
    };
  }
  
  private static String nextString(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String nextString()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_nextString(_self_, (smarthome.Home)_self);
    };
    return (java.lang.String)result;
  }
  
  private static void nextString(final Home _self, final String nextString) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void nextString(String)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_nextString(_self_, (smarthome.Home)_self,nextString);
    };
  }
  
  private static int count(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int count()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_count(_self_, (smarthome.Home)_self);
    };
    return (int)result;
  }
  
  private static void count(final Home _self, final int count) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void count(int)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_count(_self_, (smarthome.Home)_self,count);
    };
  }
  
  private static long initialTime(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# long initialTime()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_initialTime(_self_, (smarthome.Home)_self);
    };
    return (long)result;
  }
  
  private static void initialTime(final Home _self, final long initialTime) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void initialTime(long)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_initialTime(_self_, (smarthome.Home)_self,initialTime);
    };
  }
  
  private static long currentTime(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# long currentTime()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_currentTime(_self_, (smarthome.Home)_self);
    };
    return (long)result;
  }
  
  private static void currentTime(final Home _self, final long currentTime) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentTime(long)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_currentTime(_self_, (smarthome.Home)_self,currentTime);
    };
  }
  
  private static SimpleDateFormat datetimeFormatter(final Home _self) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# SimpleDateFormat datetimeFormatter()
    if (_self instanceof smarthome.Home){
    	result = smarthome.aspects.HomeAspect._privk3_datetimeFormatter(_self_, (smarthome.Home)_self);
    };
    return (java.text.SimpleDateFormat)result;
  }
  
  private static void datetimeFormatter(final Home _self, final SimpleDateFormat datetimeFormatter) {
    final smarthome.aspects.HomeAspectHomeAspectProperties _self_ = smarthome.aspects.HomeAspectHomeAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void datetimeFormatter(SimpleDateFormat)
    if (_self instanceof smarthome.Home){
    	smarthome.aspects.HomeAspect._privk3_datetimeFormatter(_self_, (smarthome.Home)_self,datetimeFormatter);
    };
  }
  
  protected static void _privk3_doIt(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
      String _fileEvents = _self.getFileEvents();
      File _file = new File(_fileEvents);
      FileReader _fileReader = new FileReader(_file);
      BufferedReader _bufferedReader = new BufferedReader(_fileReader);
      HomeAspect.br(_self, _bufferedReader);
      HomeAspect.currentString(_self, HomeAspect.br(_self).readLine());
      final String[] parsedString = HomeAspect.currentString(_self).split(",");
      HomeAspect.initialTime(_self, HomeAspect.getMillisFromStringDate(_self, parsedString[0]));
      EList<Room> _rooms = _self.getRooms();
      for (final Room r : _rooms) {
        RoomAspect.init(r);
      }
      EList<Person> _persons = _self.getPersons();
      for (final Person p : _persons) {
        PersonAspect.init(p);
      }
      EList<Pattern> _patterns = _self.getPatterns();
      for (final Pattern p_1 : _patterns) {
        PatternAspect.init(p_1, HomeAspect.initialTime(_self));
      }
      HomeAspect.count(_self, 0);
      while ((HomeAspect.currentString(_self) != null)) {
        {
          HomeAspect.tick(_self, HomeAspect.count(_self));
          int _count = HomeAspect.count(_self);
          int _plus = (_count + 1);
          HomeAspect.count(_self, _plus);
        }
      }
      InputOutput.<String>println("--END--");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static void _privk3_tick(final HomeAspectHomeAspectProperties _self_, final Home _self, final int count) {
    try {
      InputOutput.<String>println(("Iteration " + Integer.valueOf(count)));
      final String[] parsedString = HomeAspect.currentString(_self).split(",");
      int _length = parsedString.length;
      boolean _lessEqualsThan = (_length <= 2);
      if (_lessEqualsThan) {
        InputOutput.<String>println("Error parsing");
        return;
      }
      HomeAspect.currentTime(_self, HomeAspect.getMillisFromStringDate(_self, parsedString[0]));
      EList<Room> _rooms = _self.getRooms();
      for (final Room r : _rooms) {
        {
          RoomAspect.tick(r);
          boolean _equalsIgnoreCase = parsedString[1].equalsIgnoreCase(r.getName());
          if (_equalsIgnoreCase) {
            EList<Sensor> _sensors = r.getSensors();
            for (final Sensor s : _sensors) {
              boolean _equalsIgnoreCase_1 = parsedString[2].equalsIgnoreCase(s.getName());
              if (_equalsIgnoreCase_1) {
                SensorAspect.setValue(s, Double.valueOf(parsedString[3]));
              }
            }
          }
        }
      }
      EList<Person> _persons = _self.getPersons();
      for (final Person p : _persons) {
        {
          PersonAspect.tick(p);
          boolean _equalsIgnoreCase = parsedString[1].equalsIgnoreCase(p.getName());
          if (_equalsIgnoreCase) {
            Tag _chest = p.getChest();
            TagAspect.y(_chest, Double.valueOf(parsedString[2]));
            Tag _belt = p.getBelt();
            TagAspect.y(_belt, Double.valueOf(parsedString[3]));
            Tag _ankleLeft = p.getAnkleLeft();
            TagAspect.y(_ankleLeft, Double.valueOf(parsedString[4]));
            Tag _ankleRight = p.getAnkleRight();
            TagAspect.y(_ankleRight, Double.valueOf(parsedString[5]));
          }
        }
      }
      EList<Pattern> _patterns = _self.getPatterns();
      for (final Pattern p_1 : _patterns) {
        boolean _eval = PatternAspect.eval(p_1, HomeAspect.currentTime(_self));
        if (_eval) {
          PatternAspect.exec(p_1);
        }
      }
      InputOutput.<String>println("Monitoring");
      long _currentTime = HomeAspect.currentTime(_self);
      String _plus = ("Current timestamp:" + Long.valueOf(_currentTime));
      InputOutput.<String>println(_plus);
      long _currentTime_1 = HomeAspect.currentTime(_self);
      long _initialTime = HomeAspect.initialTime(_self);
      long _minus = (_currentTime_1 - _initialTime);
      long _divide = (_minus / 1000);
      String _plus_1 = ("Current timestamp elapsed(seconds):" + Long.valueOf(_divide));
      InputOutput.<String>println(_plus_1);
      EList<NamedEntity> _monitoredEntities = _self.getMonitoredEntities();
      for (final NamedEntity n : _monitoredEntities) {
        {
          String _name = n.getName();
          String _plus_2 = ("--------" + _name);
          String _plus_3 = (_plus_2 + "--------");
          InputOutput.<String>println(_plus_3);
          NamedEntityAspect.debug(n);
          InputOutput.<String>println("---------------------");
        }
      }
      HomeAspect.currentString(_self, HomeAspect.br(_self).readLine());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static long _privk3_getMillisFromStringDate(final HomeAspectHomeAspectProperties _self_, final Home _self, final String str) {
    try {
      long _time = HomeAspect.datetimeFormatter(_self).parse(str).getTime();
      return new Timestamp(_time).getTime();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static BufferedReader _privk3_br(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getBr") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.io.BufferedReader) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.br;
  }
  
  protected static void _privk3_br(final HomeAspectHomeAspectProperties _self_, final Home _self, final BufferedReader br) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setBr")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, br);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.br = br;
    }
  }
  
  protected static String _privk3_currentString(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentString;
  }
  
  protected static void _privk3_currentString(final HomeAspectHomeAspectProperties _self_, final Home _self, final String currentString) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentString);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentString = currentString;
    }
  }
  
  protected static String _privk3_nextString(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getNextString") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.nextString;
  }
  
  protected static void _privk3_nextString(final HomeAspectHomeAspectProperties _self_, final Home _self, final String nextString) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setNextString")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, nextString);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.nextString = nextString;
    }
  }
  
  protected static int _privk3_count(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCount") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.count;
  }
  
  protected static void _privk3_count(final HomeAspectHomeAspectProperties _self_, final Home _self, final int count) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCount")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, count);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.count = count;
    }
  }
  
  protected static long _privk3_initialTime(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInitialTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.initialTime;
  }
  
  protected static void _privk3_initialTime(final HomeAspectHomeAspectProperties _self_, final Home _self, final long initialTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInitialTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, initialTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.initialTime = initialTime;
    }
  }
  
  protected static long _privk3_currentTime(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentTime") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (long) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentTime;
  }
  
  protected static void _privk3_currentTime(final HomeAspectHomeAspectProperties _self_, final Home _self, final long currentTime) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentTime")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentTime);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentTime = currentTime;
    }
  }
  
  protected static SimpleDateFormat _privk3_datetimeFormatter(final HomeAspectHomeAspectProperties _self_, final Home _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getDatetimeFormatter") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.text.SimpleDateFormat) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.datetimeFormatter;
  }
  
  protected static void _privk3_datetimeFormatter(final HomeAspectHomeAspectProperties _self_, final Home _self, final SimpleDateFormat datetimeFormatter) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setDatetimeFormatter")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, datetimeFormatter);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.datetimeFormatter = datetimeFormatter;
    }
  }
}
