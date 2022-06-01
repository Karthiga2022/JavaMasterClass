
package VidhinSan;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"India");
        map.put(2,"US");
        map.put(3,"Russia");
        map.put(4,"UK");
        map.put(5,"Germany");

        System.out.println(map.get(2));

        //To replace
        map.put(2,"USA");
        System.out.println("After replace : " +map.get(2));

        map.putIfAbsent(2,"Europe");
        System.out.println("After replace : " +map.get(2));

        map.putIfAbsent(6,"Europe");

        System.out.println(map);
//comtains Key and Contain Values

        System.out.println("Contains Key : " +map.containsKey(4));
        System.out.println("Contains Key : " +map.containsKey(7));

        System.out.println("Contains Value : " +map.containsValue("Russia"));
        System.out.println("Contains Value : " +map.containsValue("Netherland"));

        map.remove(4);

//iterate through Hashmap and print

       for(Map.Entry m1 : map.entrySet())
       {
           System.out.println(m1.getKey() +" " +m1.getValue());
       }



    }


}
