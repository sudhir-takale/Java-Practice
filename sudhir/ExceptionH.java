package sudhir;

import java.util.Scanner;

class ExceptionHandling{
    Scanner sc = new Scanner(System.in);

    int a, b;

    void tryBlock(){
        System.out.println("Enter the values for the a and b");
        a = sc.nextInt();
        b = sc.nextInt();

        try{
            int c = a/b;
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println(e.getMessage());  // it will just return the description of the error
             // this exception will return the description


        }
        finally{
            System.out.println("This is a finally block");
        }
    }





}



public class ExceptionH {
    public static void main(String[] args) {
        ExceptionHandling h = new ExceptionHandling();
        h.tryBlock();


    }

}
