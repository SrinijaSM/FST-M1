package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args){
        Map<String, Integer> colors = new HashMap<>();
        colors.put("yellow",1);
        colors.put("blue",2);
        colors.put("black",3);
        colors.put("red",4);
        colors.put("pink",5);

        System.out.println("HashMap list is :="+colors);
        System.out.println("Removed a color from list "+colors.remove("blue"));
        System.out.println("Updated HashMap list is :="+colors);

        if(colors.containsValue("Green")) {
            System.out.println("Green exists in the Map");
        } else {
            System.out.println("Green does not exist in the Map");
        }
        System.out.println("size od HasMap list "+colors.size() );
    }
}
