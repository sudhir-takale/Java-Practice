package sudhir;
import java.lang.Comparable;
public class Student implements Comparable<Student>{

    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.roll > o.roll) return  1;
        else if(this.roll < o.roll) return  -1;
        else{
            return  0;
        }
    }
}



