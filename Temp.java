import java.util.HashMap;
import java.util.Map;

public class Temp {
    
    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a","'b':('c':'d')");
        inputMap.put("b","('c':'d')");
        inputMap.put("c","'d'");
        System.out.println("For key='a', value ="+inputMap.get("a"));
        System.out.println("For key='b', value ="+inputMap.get("b"));
        System.out.println("For key='c', value ="+inputMap.get("c"));
        
    }
    
}
