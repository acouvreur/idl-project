package smarthome.aspects;

import java.util.Map;
import smarthome.Sensor;
import smarthome.aspects.SensorAspectSensorAspectProperties;

@SuppressWarnings("all")
public class SensorAspectSensorAspectContext {
  public final static SensorAspectSensorAspectContext INSTANCE = new SensorAspectSensorAspectContext();
  
  public static SensorAspectSensorAspectProperties getSelf(final Sensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.SensorAspectSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sensor, SensorAspectSensorAspectProperties> map = new java.util.WeakHashMap<smarthome.Sensor, smarthome.aspects.SensorAspectSensorAspectProperties>();
  
  public Map<Sensor, SensorAspectSensorAspectProperties> getMap() {
    return map;
  }
}
