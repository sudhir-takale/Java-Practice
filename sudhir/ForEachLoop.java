public class ForEachLoop {

//    static  void printArray(int a[], int n){
//        for (int i = 0; i < n; i++){
//            System.out.println(i);
//        }
//    }

//    this is for each loop in java in which the function will print array like this here we not need to give the size of array
//            it will detect it automatically
    static void printArray(int a[]){
        for (int i : a){
            System.out.println(i);
        }
    }


    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5};
        int n = 5;
        printArray(a);


    }

}
