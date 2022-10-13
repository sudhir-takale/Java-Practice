package sudhir;

public class RotateBYKpos {
    static int [] rotateArray(int a[], int size){
        int b[] = new int [4];
        int k = 2;
        for (int i =0; i < size; i++){
            int c = (i + k) %size;
            b[c] = a[i];
        }
     return  b;
    }


    static  void printArray(int a[], int n){
        for ( int k : a) {
            System.out.println(k);

        }
    }

    public static void main(String[] args) {
      int k[] =new int[4];
        int a[] = {2, 6, 8, 45};
        int size = 4;
      k  =  rotateArray(a, size);
        printArray(k, size);


    }
}
