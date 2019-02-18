package smarthome.aspects;

import java.util.Map;
import smarthome.NamedEntity;
import smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties;

@SuppressWarnings("all")
public class NamedEntityAspectNamedEntityAspectContext {
  public final static NamedEntityAspectNamedEntityAspectContext INSTANCE = new NamedEntityAspectNamedEntityAspectContext();
  
  public static NamedEntityAspectNamedEntityAspectProperties getSelf(final NamedEntity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<NamedEntity, NamedEntityAspectNamedEntityAspectProperties> map = new java.util.WeakHashMap<smarthome.NamedEntity, smarthome.aspects.NamedEntityAspectNamedEntityAspectProperties>();
  
  public Map<NamedEntity, NamedEntityAspectNamedEntityAspectProperties> getMap() {
    return map;
  }
}
