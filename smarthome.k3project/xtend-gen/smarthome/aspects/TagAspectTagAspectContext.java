package smarthome.aspects;

import java.util.Map;
import smarthome.Tag;
import smarthome.aspects.TagAspectTagAspectProperties;

@SuppressWarnings("all")
public class TagAspectTagAspectContext {
  public final static TagAspectTagAspectContext INSTANCE = new TagAspectTagAspectContext();
  
  public static TagAspectTagAspectProperties getSelf(final Tag _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.TagAspectTagAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Tag, TagAspectTagAspectProperties> map = new java.util.WeakHashMap<smarthome.Tag, smarthome.aspects.TagAspectTagAspectProperties>();
  
  public Map<Tag, TagAspectTagAspectProperties> getMap() {
    return map;
  }
}
