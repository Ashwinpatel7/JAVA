import java.util.Stack;

public class Displystack {
    public static void DisplayRec(Stack<Integer> str){
        if (str.size()==0) return;
        int top = str.pop();
        System.out.println(top+" ");
        DisplayRec(str);
        str.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> str = new Stack<>();
        str.push(1);
        str.push(2);
        str.push(3);
        str.push(4);
        str.push(5);

        DisplayRec(str); // Call the Display method passing the stack

        System.out.println(str); // Print the stack after displaying its content
    }


    public static void Display(Stack<Integer> str) {
        int n = str.size();
        int[] arr = new int[n];

        // Extract elements from the stack and store them in an array
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = str.pop();
        }

        // Display the elements from the array and push them back to the stack
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
            str.push(arr[i]);
        }
        System.out.println(); // Move to the next line after displaying all elements
    }
}
