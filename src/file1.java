import java.util.Scanner;

public class file1 {

    static void multiply(int[][] a, int r1,int c1, int[][] b, int r2, int c2){
        if(c1!=r2){
            System.out.println("The multiplication is not possible - wrong dimension");
            return;

        }
        int[][] mul = new int[r1][c2];
        for(int i =0; i<r1; i++){// row number
            for(int j =0; j<c2; j++){// column number
                for(int k =0; k<r1; k++){
                    mul[i][j] +=(a[i][k] *b[k][j]);
                }

            }
        }


        System.out.println("Multiplication of two matrices");
        printArray(mul);


    }
    static void add(int[][] a, int r1,int c1, int[][] b, int r2, int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Addition not possible");
            return;/* The return is used here so that the methods stop at this point and a blank return is used because the datatype is void */
        }
        int[][] sum = new int[r2][c2];

        for(int i=0; i<r1; i++){
            for (int j=0; j<c1; j++){
                sum[i][j]= a[i][j]+b[i][j];
            }
        }
        printArray(sum
        );
    }
    static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        //Different ways of initialzing an  2-D array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and colum of matrix 1");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter matrix values");
        for (int i=0; i<r; i++){
            for(int j =0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the row and colum of matrix 2");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int [][] arr1 = new int[r1][c1];
        System.out.println("Enter matrix values");
        for (int i=0; i<r1; i++){
            for(int j =0; j<c1; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        printArray(arr);
        System.out.println("Matrix 2");
        printArray(arr1);
        System.out.println("The resultant matrix will be");
//        add(arr,r,c,arr1,r1,c1);
        multiply(arr,r,c,arr1,r1,c1);
    }
}
