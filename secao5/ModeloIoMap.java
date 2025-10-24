package secao5;

import java.util.HashMap;
import java.util.Map;

public class ModeloIoMap {
    public static void main(String[] args) {
        
        Map<String,Integer >map = new HashMap<>();

        map.put("Alice", 30);
        map.put("Breno", 25);
        map.put("Charlie", 35);



        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos.");
            
        }

    }
}
