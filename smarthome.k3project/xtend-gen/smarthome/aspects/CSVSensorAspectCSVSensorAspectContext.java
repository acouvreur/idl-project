package smarthome.aspects;

import java.util.Map;
import smarthome.CSVSensor;
import smarthome.aspects.CSVSensorAspectCSVSensorAspectProperties;

@SuppressWarnings("all")
public class CSVSensorAspectCSVSensorAspectContext {
  public final static CSVSensorAspectCSVSensorAspectContext INSTANCE = new CSVSensorAspectCSVSensorAspectContext();
  
  public static CSVSensorAspectCSVSensorAspectProperties getSelf(final CSVSensor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.CSVSensorAspectCSVSensorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<CSVSensor, CSVSensorAspectCSVSensorAspectProperties> map = new java.util.WeakHashMap<smarthome.CSVSensor, smarthome.aspects.CSVSensorAspectCSVSensorAspectProperties>();
  
  public Map<CSVSensor, CSVSensorAspectCSVSensorAspectProperties> getMap() {
    return map;
  }
}
