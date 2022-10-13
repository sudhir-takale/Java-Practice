package sudhir;
// we can make the iterator to get values one  by one
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Sudhir");
        s.push("How");
        s.push("Shaurya");
        s.push("Sanvi");
        s.push("Vaishnavi");

        ListIterator<String>  li = s.listIterator();
        // we get the various methods like hasnext, next, hasprevious, previous
        System.out.println(li.next());
//        System.out.println(li.previous()); // it will return  the previous object


//        System.out.println(s.empty());//  checks whether the stack is empty

//        System.out.println(s.search("Vaishnavi"));
//        System.out.println(s); // it prints the element collectively .
        // if you want to print the element one by one then use iterator
//        System.out.println(s.peek()); // tells  the peek element from the stack
//        System.out.println(s.pop()?); // pops the top element
//        Iterator<String> it = s.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        // we can also use the for each loop to print the elements
//        for (String value : s) {
//            System.out.println(value);
//        }
    }

}
