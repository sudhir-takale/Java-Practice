package sudhir;

public class ALLBasicOperations {

    static int[] reverseArray(int[] a, int n){
        int start = 0;
        int end = n - 1;
        while(start <= end){

            int temp = a[start];
            a[start] = a[end];
            a[end] =temp;

        }
        return  a;
    }
    static void printArray(int a[], int size){

            for (int  j = 0; j <size; j++){

                System.out.println(a[j]);

        }
    }


    public static void main(String[] args) {

        int a [] = {1, 4, 3, 6, 34, 67,23};
        int size = 7;
        printArray(a, size);
        reverseArray(a, size);
        printArray(a, size);



    }


}
