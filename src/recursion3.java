import java.util.Scanner;

public class recursion3 {
//    static int sumSeries(int a){
//        if(a==0) return 0;// Base case
////           int d = sumSeries(a-1);//Recursive work
//           return sumSeries(a-1)+a;//Self work




    static int alternateSeries(int a){
        if(a==0) return 0;
        if(a%2==0) return alternateSeries(a-1)-a;
        else return alternateSeries(a-1)+a;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int a = sc.nextInt();
        System.out.println(alternateSeries(a));
    }
}