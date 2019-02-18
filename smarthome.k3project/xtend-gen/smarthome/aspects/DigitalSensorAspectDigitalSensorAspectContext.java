package smarthome.aspects;

import java.util.Map;
import smarthome.DigitalSensor;
import smarthome.aspects.DigitalSensorAspectDigitalSensorAspectProperties;

@SuppressWarnings("all")
public class DigitalSensorAspectDigitalSensorAspectContext {
  public final static DigitalSensorAspectDigitalSensorAspectContext INSTANCE = new DigitalSensorAspectDigitalSensorAspectContext();
  
  public static DigitalSensorAspectDigitalSensorAspectProperties getSelf(final DigitalSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.DigitalSensorAspectDigitalSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DigitalSensor, DigitalSensorAspectDigitalSensorAspectProperties> map = new java.util.WeakHashMap<smarthome.DigitalSensor, smarthome.aspects.DigitalSensorAspectDigitalSensorAspectProperties>();
  
  public Map<DigitalSensor, DigitalSensorAspectDigitalSensorAspectProperties> getMap() {
    return map;
  }
}
