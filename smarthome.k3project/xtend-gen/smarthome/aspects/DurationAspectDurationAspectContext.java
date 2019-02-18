package smarthome.aspects;

import java.util.Map;
import smarthome.Duration;
import smarthome.aspects.DurationAspectDurationAspectProperties;

@SuppressWarnings("all")
public class DurationAspectDurationAspectContext {
  public final static DurationAspectDurationAspectContext INSTANCE = new DurationAspectDurationAspectContext();
  
  public static DurationAspectDurationAspectProperties getSelf(final Duration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.DurationAspectDurationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Duration, DurationAspectDurationAspectProperties> map = new java.util.WeakHashMap<smarthome.Duration, smarthome.aspects.DurationAspectDurationAspectProperties>();
  
  public Map<Duration, DurationAspectDurationAspectProperties> getMap() {
    return map;
  }
}
