import java.util.Scanner;
public class strings {
    // methods in string class
    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string for the input : ");
        // strings are immutable but we cannnot change the string
        String s = "Sudhir";
//       String s = sc.next();
//        System.out.println(s.length()); // returns the length of the string

//       String m = s.toLowerCase();  // to lowercase the string
//        System.out.println(m);

//        String m = s.toUpperCase();  // to uppercase the string
//        System.out.println(m);

//        String m = s.substring(3); // return substring from third letter
//        System.out.println(m);

//        String m = s.substring(2 ,5);  // start with 2 and end with 5 index
//        System.out.println(m);

//        String m = s.replace("r", "s");  // replace r by s
//        System.out.println(m);

//        System.out.println(s.charAt(4));  // return the char at 4 index

        System.out.println(s.lastIndexOf("ud"));  // return the last index of ud
        System.out.println(s.equals("Sudhir"));
        System.out.println(s.equalsIgnoreCase("SuDhir"));  // return true if cases are different

        System.out.println(s.indexOf("d")); // index of d in string

        System.out.println(s.endsWith("ir")); // return true if string end with ir otherwise false

       String k = s.replace("ir", "vt"); // replace the ir with vt
        System.out.println(k);








































    }





}
