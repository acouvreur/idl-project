package smarthome.aspects;

import java.util.Map;
import smarthome.Pattern;
import smarthome.aspects.PatternAspectPatternAspectProperties;

@SuppressWarnings("all")
public class PatternAspectPatternAspectContext {
  public final static PatternAspectPatternAspectContext INSTANCE = new PatternAspectPatternAspectContext();
  
  public static PatternAspectPatternAspectProperties getSelf(final Pattern _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.PatternAspectPatternAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Pattern, PatternAspectPatternAspectProperties> map = new java.util.WeakHashMap<smarthome.Pattern, smarthome.aspects.PatternAspectPatternAspectProperties>();
  
  public Map<Pattern, PatternAspectPatternAspectProperties> getMap() {
    return map;
  }
}
