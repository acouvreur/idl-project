package smarthome.aspects;

import java.util.Map;
import smarthome.SensorPredicate;
import smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties;

@SuppressWarnings("all")
public class SensorPredicateAspectSensorPredicateAspectContext {
  public final static SensorPredicateAspectSensorPredicateAspectContext INSTANCE = new SensorPredicateAspectSensorPredicateAspectContext();
  
  public static SensorPredicateAspectSensorPredicateAspectProperties getSelf(final SensorPredicate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<SensorPredicate, SensorPredicateAspectSensorPredicateAspectProperties> map = new java.util.WeakHashMap<smarthome.SensorPredicate, smarthome.aspects.SensorPredicateAspectSensorPredicateAspectProperties>();
  
  public Map<SensorPredicate, SensorPredicateAspectSensorPredicateAspectProperties> getMap() {
    return map;
  }
}
