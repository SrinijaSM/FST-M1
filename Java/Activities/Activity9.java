package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
            myList.add("test");
            myList.add("test1");
            myList.add("test2");
            myList.add("test3");
            myList.add("test4");

        //for each loop
        for(String x:myList)
        {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("Third name in arraylist is "+myList.get(2));
        System.out.println("Arraylist contains Test4 name in list : ="+myList.contains("test4"));
        System.out.println("ArrayList size :="+myList.size());
        myList.remove(2);
        System.out.println("ArrayList size after removing one name :="+myList.size());
        System.out.println("ArrayList names after removing one name :="+myList);


    }
}
