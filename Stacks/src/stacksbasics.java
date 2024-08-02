import java.util.Stack;

public class stacksbasics {
    public static void main(String[] args) {
//        The implementation of stack is as same as arraylist
        Stack<Integer> str= new Stack<>();
//        Pushing values into stack
        str.push(7);
        str.push(9);
        str.push(11);
        str.push(19);
//        Peeking values in a stack it will return the uppermost value in the stack
        System.out.println(str.peek());
        System.out.println(str);//Printing the full stack
        str.pop();//Delete the uppermost element
        System.out.println(str);
//        while (str.size()>1){
//            str.pop();
//        }
//        System.out.println(str);
    }
}
