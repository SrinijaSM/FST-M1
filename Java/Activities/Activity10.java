package Activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args){
        Set<String> hs = new HashSet<>();
        hs.add("pen");
        hs.add("paper");
        hs.add("book");
        hs.add("pencil");
        hs.add("eraser");
        hs.add("shaper");

        System.out.println("HashsetList := "+ hs);
        System.out.println("Hash set size is :="+hs.size());
        System.out.println("Removed element from HashSet "+hs.remove(1));

        if(hs.remove("paper"))
        {
            System.out.println("paper removed from set");
        }else
        {
            System.out.println("paper is not present in hashset");
        }

        System.out.println("Contains pencil in list = " +hs.contains("pencil"));

        System.out.println("updated list := "+hs);

    }
}
