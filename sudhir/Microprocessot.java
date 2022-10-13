package sudhir;

public class Microprocessot implements Comparable<Microprocessot>{

    int speed;
    String name;
    int version;

    public Microprocessot(int speed, String name, int version) {
        this.speed = speed;
        this.name = name;
        this.version = version;
    }

//    @Override
//    public String toString() {
//        return "Microprocessot{" +
//                "speed=" + speed +
//                ", name='" + name + '\'' +
//                ", version=" + version +
//                '}';
//    }


    public int compareTo(Microprocessot s){

        return  this.speed - s.speed;
    }


}
