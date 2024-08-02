class Array2{

    void searchofArrays(){
        int[] arr3 ={5,7,9,10};
        int x=9;
        int ans=-1;
        for (int i =0; i< arr3.length; i++){
            if (arr3[i]==x){
                ans=i;
                //The break keyword is used to stop the loop at the place where the number is first found
                break;
            }
        }
        System.out.println("Found at" + ans
        );
    }
    void maxofArrays(){//to find maximum value present in the array
        int[] arr2 ={7,8,9,10};
        int max = 0;
        for(int i =0; i <arr2.length; i++){
            if (max < arr2[i]) {
                max= arr2[i];

            }
        }
        System.out.println(max);
    }
    void sumofArrays(){
        int[] arr1 = {3,5,9};
        int sum=0;
        for(int i=0; i< arr1.length; i++){
            sum= sum+arr1[i];

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Array2 obj = new Array2();
        obj.sumofArrays();
        obj.maxofArrays();
        obj.searchofArrays();
    }
}