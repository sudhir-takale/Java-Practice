import java.util.Scanner; // class for taking the input from user

class Input {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of input :");
       byte a = sc.nextByte();  // to read the input from user
        System.out.println("Enter the value of k");
       int k = sc.nextInt();
       boolean check = sc.hasNextInt(); // it tells the inputed value is of the same type or not
        System.out.println(check);
        System.out.println("The value of byte is " +a);
        System.out.println("The value of int is : " +k);



    }



}
