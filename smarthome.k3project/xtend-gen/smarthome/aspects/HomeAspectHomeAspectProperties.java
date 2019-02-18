package smarthome.aspects;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;

@SuppressWarnings("all")
public class HomeAspectHomeAspectProperties {
  public BufferedReader br;
  
  public String currentString;
  
  public String nextString;
  
  public int count;
  
  public long initialTime;
  
  public long currentTime;
  
  public SimpleDateFormat datetimeFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
}
