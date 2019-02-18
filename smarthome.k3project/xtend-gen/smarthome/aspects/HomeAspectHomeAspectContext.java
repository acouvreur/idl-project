package smarthome.aspects;

import java.util.Map;
import smarthome.Home;
import smarthome.aspects.HomeAspectHomeAspectProperties;

@SuppressWarnings("all")
public class HomeAspectHomeAspectContext {
  public final static HomeAspectHomeAspectContext INSTANCE = new HomeAspectHomeAspectContext();
  
  public static HomeAspectHomeAspectProperties getSelf(final Home _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.HomeAspectHomeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Home, HomeAspectHomeAspectProperties> map = new java.util.WeakHashMap<smarthome.Home, smarthome.aspects.HomeAspectHomeAspectProperties>();
  
  public Map<Home, HomeAspectHomeAspectProperties> getMap() {
    return map;
  }
}
