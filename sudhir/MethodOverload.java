import java.util.*;

class Overload {
    Scanner sc = new Scanner(System.in);


    void findVolume() {
        System.out.println("Enter the value of length :");
        float l = sc.nextFloat();

        float volume = l * l * l;
        System.out.println("The volume of cube is " + volume);
    }

    void findVolume(int a, int c) {
        int s = a + c;
        System.out.println("The addition of two number is " + s);
    }

    float findVolume(float k, float z) {
        float c = k * z;
        return c;
    }


}


class MethodOverload {

    public static void main(String[] args) {
        Overload k = new Overload();
        k.findVolume();
        k.findVolume(34, 67);
        float y = k.findVolume(1.2f, 3.4f);

        System.out.println("The multiplication of two numbers is " + y);
    }


}
