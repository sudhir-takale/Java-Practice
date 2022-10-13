package sudhir;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();// we can provide the size of the list
        list.add(34);
        list.add(3478);
        list.add(334);  // add will insert the element in array

//        System.out.println(list);


list.forEach(System.out::println);    }
}