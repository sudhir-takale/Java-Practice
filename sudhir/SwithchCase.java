import java.util.Scanner;

public class SwithchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of choice :");
        int c = sc.nextInt();


        // THIS IS SIMPLE SWITCH CASE which we are generally use in all languages

        switch (c) {

            case 1:
                System.out.println("how are you ");
                break;

            case 2:
                System.out.println("hii what are you doing");
                break;
            case 3:
                System.out.println("Can you please tell me what is your name");
                break;
            default:
                System.out.println("You have entered wrong choice");
                break;

            // THIS IS THE ENHANCED SWITCH CASE WORKS SAME LIKE SIMPLE SWICH CASE
//        switch (c) {
//            case 1 -> System.out.println("how are you ");
//            case 2 -> System.out.println("hii what are you doing");
//            case 3 -> System.out.println("Can you please tell me what is your name");
//            default -> System.out.println("You have entered wrong choice");
//        }

        }


    }
}