
class TestConstructor{

    int price;
    int no_of_keys;
    String name;

    TestConstructor(int p, int nk, String s){  // this constructor wil call automatically when we crate the object of class
        price = p;
        no_of_keys = nk;
        name = s;
    }
    TestConstructor(){
        System.out.println("Hii checking the constructor of the class how are you today ");
    }
    void printData(){
        System.out.println("The price of laptop is "+ price);
        System.out.println("There are " + no_of_keys + " in laptop ");
        System.out.println(name + " this is brand of the laptop");
    }




}



public class Constructor {
    public static void main(String[] args) {
     TestConstructor ts = new TestConstructor(325, 65, "apple ");
     ts.printData();
    }

}
