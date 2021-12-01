package tb.soft;
import java.util.HashMap;

public class logiihasla {
    HashMap<String,String>  loginy = new HashMap<String,String>();
    logiihasla(){
        loginy.put("Masny","Ben");
        loginy.put("Jan","Zemo");
        loginy.put("login","haslo");
        loginy.put("abc","123");
    }
    protected HashMap getloginy(){
        return loginy;
    }
}
