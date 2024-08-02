import java.util.ArrayList;

public class oops7 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();//Making an arraylist in java
        arr.add(9);
        arr.add(4);
        arr.add(3);
        arr.add(9);
        arr.set(1,3);
        System.out.println(arr.size());
        System.out.println(arr);
    }
}