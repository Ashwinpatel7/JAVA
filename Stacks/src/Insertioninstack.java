import java.util.Stack;

public class Insertioninstack {
    public static void main(String[] args) {
        Stack<Integer> str = new Stack<>();
        str.push(1);
        str.push(2);
        str.push(3);
        str.push(4);
        str.push(5);
        //Inserting 6 at index 1
        Stack<Integer> gtr = new Stack<>();
        while (str.size()>1){
            gtr.push(str.pop());
        }
        str.push(6);
        while (gtr.size()>0){
            str.push(gtr.pop());
        }
        System.out.println(str);
    }
}
