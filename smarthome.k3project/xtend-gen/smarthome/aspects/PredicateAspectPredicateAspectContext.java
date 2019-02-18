package smarthome.aspects;

import java.util.Map;
import smarthome.Predicate;
import smarthome.aspects.PredicateAspectPredicateAspectProperties;

@SuppressWarnings("all")
public class PredicateAspectPredicateAspectContext {
  public final static PredicateAspectPredicateAspectContext INSTANCE = new PredicateAspectPredicateAspectContext();
  
  public static PredicateAspectPredicateAspectProperties getSelf(final Predicate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.PredicateAspectPredicateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Predicate, PredicateAspectPredicateAspectProperties> map = new java.util.WeakHashMap<smarthome.Predicate, smarthome.aspects.PredicateAspectPredicateAspectProperties>();
  
  public Map<Predicate, PredicateAspectPredicateAspectProperties> getMap() {
    return map;
  }
}
