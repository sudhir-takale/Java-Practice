package sudhir;

public class Microprocessor implements Comparable <Microprocessor>{

   int speed;
    int version;
    String name;

    public Microprocessor(int speed, int version, String name) {
        this.speed = speed;
        this.version = version;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Microprocessor[" +
                "speed=" + speed +
                ", version=" + version +
                ", name='" + name + '\'' +
                ']';
    }


    public int compareTo(Microprocessor o) {
        return  speed - o.speed;
    }
}

