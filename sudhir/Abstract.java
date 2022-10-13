package sudhir;


abstract  class Abstraction{
    abstract void switchOff();
    void getInfo(){
        System.out.println("How are you today !");
    }

}
class New extends Abstraction{
    void SwitchOff(){
        System.out.println("How are you");
    }


    @Override
    void switchOff() {
        System.out.println("How re sakfjdklj");
    }
}
class abs extends  Abstraction{

    void switchOff(){
        System.out.println("I am switching off ...");
    }

}



public class Abstract {



    public static void main(String[] args) {
        abs as = new abs();
        as.getInfo();
        as.switchOff();
New n  = new New();
       n.switchOff();
    }

}
