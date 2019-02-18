package smarthome.aspects;

import java.util.Map;
import smarthome.Room;
import smarthome.aspects.RoomAspectRoomAspectProperties;

@SuppressWarnings("all")
public class RoomAspectRoomAspectContext {
  public final static RoomAspectRoomAspectContext INSTANCE = new RoomAspectRoomAspectContext();
  
  public static RoomAspectRoomAspectProperties getSelf(final Room _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new smarthome.aspects.RoomAspectRoomAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Room, RoomAspectRoomAspectProperties> map = new java.util.WeakHashMap<smarthome.Room, smarthome.aspects.RoomAspectRoomAspectProperties>();
  
  public Map<Room, RoomAspectRoomAspectProperties> getMap() {
    return map;
  }
}
