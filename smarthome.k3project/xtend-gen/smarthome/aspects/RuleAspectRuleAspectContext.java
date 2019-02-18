package smarthome.aspects;

import java.util.Map;
import smarthome.Rule;
import smarthome.aspects.RuleAspectRuleAspectProperties;

@SuppressWarnings("all")
public class RuleAspectRuleAspectContext {
  public final static RuleAspectRuleAspectContext INSTANCE = new RuleAspectRuleAspectContext();
  
  public static RuleAspectRuleAspectProperties getSelf(final Rule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.RuleAspectRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rule, RuleAspectRuleAspectProperties> map = new java.util.WeakHashMap<smarthome.Rule, smarthome.aspects.RuleAspectRuleAspectProperties>();
  
  public Map<Rule, RuleAspectRuleAspectProperties> getMap() {
    return map;
  }
}
