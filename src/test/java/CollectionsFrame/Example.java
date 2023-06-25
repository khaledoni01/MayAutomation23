package CollectionsFrame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Example {


    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(10, "USA");
        map.put(20, "Canada");

        for(Integer m : map.keySet()) {
            System.out.println(map.get(m));
        }

    }

}
