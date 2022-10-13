package sudhir;

class MyExceptio extends  Exception{

    MyExceptio(){
        super("This is custom exception");
    }
    MyExceptio(String str){
        super(str);
    }
}

public class CustomException {

    public static void main(String[] args) {

        int age = 1;
   try {
       if (age > 12) {
           throw new MyExceptio("You are not eligible for voting");
       } else {
           System.out.println("You can vote ");
       }

   }
   catch (MyExceptio e){
       System.out.println(e.getMessage());
   }
    }


}
