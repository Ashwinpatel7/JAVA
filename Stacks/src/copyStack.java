import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> str = new Stack<>();
        str.push(1);
        str.push(2);
        str.push(3);
        str.push(4);
        str.push(5);
//        System.out.println("Enter the no of values");
//        int n = sc.nextInt();
//        System.out.println("Enter the integers");
//        for (int i =1; i<=n; i++){
//            int x = sc.nextInt();
//            str.push(x);
//        }
        System.out.println(str);
        Stack<Integer> rtr = new Stack<>();
        while (str.size()>0){
//            int x = str.peek();
//            rtr.push(x);
//            str.pop();
//            Instead of these lines we can use
            rtr.push(str.pop());
        }
//       We will make another empty stack
        Stack<Integer> gtr = new Stack<>();

        while (rtr.size()>0){
            gtr.push(rtr.pop());
        }
        System.out.println(gtr);

    }
}
