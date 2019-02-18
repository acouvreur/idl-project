package smarthome.aspects;

import java.util.Map;
import smarthome.AnalogSensor;
import smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties;

@SuppressWarnings("all")
public class AnalogSensorAspectAnalogSensorAspectContext {
  public final static AnalogSensorAspectAnalogSensorAspectContext INSTANCE = new AnalogSensorAspectAnalogSensorAspectContext();
  
  public static AnalogSensorAspectAnalogSensorAspectProperties getSelf(final AnalogSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<AnalogSensor, AnalogSensorAspectAnalogSensorAspectProperties> map = new java.util.WeakHashMap<smarthome.AnalogSensor, smarthome.aspects.AnalogSensorAspectAnalogSensorAspectProperties>();
  
  public Map<AnalogSensor, AnalogSensorAspectAnalogSensorAspectProperties> getMap() {
    return map;
  }
}
