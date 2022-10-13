// we cant change the values of variable of the interface once defined
interface Bicycle {
    int a = 345;

    void applyBrakes(int decrement);

    void speedUp(int increment);
}

interface Horns {
    void blowHorns();

    void blowHorn();
}

class AvonBicycle implements Bicycle, Horns {
    int speed = 45;

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
        System.out.println("The speed after applying breakes is " + speed);
    }

    public void speedUp(int increment) {
        speed = speed + increment;
        System.out.println("The speed after applying brakes is " + speed);
    }

    public void blowHorns() {
        System.out.println("We are going to blow horn");
    }

    public void blowHorn() {
        System.out.println("How to run the same program given by the number of times");
    }

}



public class Interfaces {



    public static void main(String[] args) {


        AvonBicycle avon = new AvonBicycle();
        avon.blowHorn();
        avon.speedUp(4);
        avon.blowHorns();
        avon.applyBrakes(8);
        System.out.println(avon.a); // prints the value of a form interface class    }
    }
}