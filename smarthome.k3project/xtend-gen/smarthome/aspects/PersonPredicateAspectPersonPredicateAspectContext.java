package smarthome.aspects;

import java.util.Map;
import smarthome.PersonPredicate;
import smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties;

@SuppressWarnings("all")
public class PersonPredicateAspectPersonPredicateAspectContext {
  public final static PersonPredicateAspectPersonPredicateAspectContext INSTANCE = new PersonPredicateAspectPersonPredicateAspectContext();
  
  public static PersonPredicateAspectPersonPredicateAspectProperties getSelf(final PersonPredicate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<PersonPredicate, PersonPredicateAspectPersonPredicateAspectProperties> map = new java.util.WeakHashMap<smarthome.PersonPredicate, smarthome.aspects.PersonPredicateAspectPersonPredicateAspectProperties>();
  
  public Map<PersonPredicate, PersonPredicateAspectPersonPredicateAspectProperties> getMap() {
    return map;
  }
}
