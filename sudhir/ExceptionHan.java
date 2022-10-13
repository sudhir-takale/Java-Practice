package sudhir;

class Main{

    void printDivision(int a, int b) throws  ArithmeticException, RuntimeException{

        if (b == 0){
            int c = a/b;
        }
        else{
            System.out.println(a/b);
        }
    }

}



public class ExceptionHan {
    public static void main(String[] args) {
        Main m = new Main();
        m.printDivision(12, 0);
    }
}
