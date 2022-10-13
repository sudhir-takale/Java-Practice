package sudhir;

// in dynamic dispatch method we have the reference of one class but we create the object of another
// class
// we can run only methods which are present in the super class
// if any method override in subclass then it will run the first

class OldPhone{

    void playMusic(){
        System.out.println("Playing music on OldPhone...");
    }
    void showDate(){
        System.out.println("Showing date and time ..");
    }

    void setAlarm(){
        System.out.println( "Alarm set of morning at 10 o clock");
    }

}

class SmartPhone extends  OldPhone{
    void gps(){
        System.out.println("Opening gps in smathPhone");
    }
@Override
    void showDate(){
        System.out.println(":Showing date on smartPhone...");
    }
//    void playMusic(){
//        System.out.println("Playing music on Smartphone");
//    }
}

public class DynamicDispatch {
    public static void main(String[] args) {

        OldPhone phone = new SmartPhone();
        phone.playMusic(); // it gives preference on subclass if any method is overridden
//        phone.gps();  // it will not run methods from the subclass which are exist on superclass
         phone.showDate();

    }

}
