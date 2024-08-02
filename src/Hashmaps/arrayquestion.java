package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class arrayquestion {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,3,4,5,6,4,3,4,5,4,3,54,3,4,5,3,4,5,4};
        Map<Integer,Integer> freq = new HashMap<>();
        for (int el : arr){
            if (!freq.containsKey(el)){
                freq.put(el,1);
            } else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println("Frequency map");
        System.out.println(freq.entrySet());
        int maxFreq=0,anskey=-1;
        for (var e :freq.entrySet()){
            if (e.getValue()>maxFreq){
                maxFreq=e.getValue();
                anskey=e.getKey();
            }
        }
        System.out.printf("%d has max frequency and has occured %d times",anskey,maxFreq);
    }
}
-+-