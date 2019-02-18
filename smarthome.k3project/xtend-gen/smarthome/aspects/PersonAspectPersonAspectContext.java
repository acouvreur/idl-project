package smarthome.aspects;

import java.util.Map;
import smarthome.Person;
import smarthome.aspects.PersonAspectPersonAspectProperties;

@SuppressWarnings("all")
public class PersonAspectPersonAspectContext {
  public final static PersonAspectPersonAspectContext INSTANCE = new PersonAspectPersonAspectContext();
  
  public static PersonAspectPersonAspectProperties getSelf(final Person _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.PersonAspectPersonAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Person, PersonAspectPersonAspectProperties> map = new java.util.WeakHashMap<smarthome.Person, smarthome.aspects.PersonAspectPersonAspectProperties>();
  
  public Map<Person, PersonAspectPersonAspectProperties> getMap() {
    return map;
  }
}
