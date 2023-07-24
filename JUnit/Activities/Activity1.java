package JunitActivities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {

    static List list;

    @BeforeAll
    static void setup() throws Exception{
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }

    @Test
    public void insertTest(){
        assertEquals(2, list.size(), "Wrong size");
        list.add(2,"gamma");
        assertEquals(3, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("gamma", list.get(2), "Wrong element");
    }

    @Test
    public void replace(){
        list.set(1, "gamma1");
        assertEquals(2, list.size(), "Wrong size");
       // assertEquals(3, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("gamma1", list.get(1), "Wrong element");
    }
}
