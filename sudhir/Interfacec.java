package sudhir;
// the all methods from interface must be implemented
//we can't make the object of interface
// all method should be declared as public

interface Bicycle{
    void maxSpeed();
    void minSpeed();
    void cost();

}

class AvonBicycle implements Bicycle{

    void showData(){
        System.out.println("The name of cycle is Avon");
    }
    public void maxSpeed(){
        System.out.println("The max speed of Avon cycle is 69 km/hr");
    }
   public void minSpeed(){
        System.out.println("The maximum speed of Avon cycle is 34 km/hr");
    }
   public void cost(){
        System.out.println("The cost of one cycle is 8457rs");
    }


}


public class Interfacec {
    public static void main(String[] args) {
        AvonBicycle avon = new AvonBicycle();
        avon.cost();

    }
}
