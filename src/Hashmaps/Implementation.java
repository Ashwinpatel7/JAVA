package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Implementation {
    static void Hashmps() {
        Map<String, Integer> ash = new HashMap<>();
//    Adding Elements
        ash.put("Akash",21);
        ash.put("Ashwin",20);
        ash.put("Shubh",19);
//        Getting value by key
        System.out.println(ash.get("Akash"));
//        Changing values
        ash.put("Akash",25);
//        Removing a pair
        System.out.println(ash.remove("Shubh"));
//        Checking whether it is present or not
        System.out.println(ash.containsKey("Shubh"));
//        Adding a new value if key is not already present
        ash.putIfAbsent("Anay",4);
//        Getting all keys in Hashmaps
        System.out.println(ash.keySet());
//        Get all values
        System.out.println(ash.values());
//        Get both
        System.out.println(ash.entrySet());
//        For traversing a hashmap
  for (String key : ash.keySet()) {
System.out.printf("Age of %s is %d\n", key, ash.get(key));
}
  for (Map.Entry<String,Integer> e :ash.entrySet()){
      System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
  }



    }

    public static void main(String[] args) {
        Hashmps();

    }
}
