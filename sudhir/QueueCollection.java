package sudhir;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class QueueCollection {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        ArrayDeque<String> ad = new ArrayDeque<>();
        ad.offer("How are  you");
        ad.add("78");
        ad.offer("can");
        for (String k :ad
             ) {
            System.out.println( k);

        }
        // we can't make the object of the queue directly
        q.offer(78);
       q.offer(90);
       q.offer(23);
       q.add(56); // this method to add element can throw exception
        q.offer(675);

//        System.out.println(q.poll()); // to delete the element from the queue

//        System.out.println(q);

//        q.remove(78); // removes the 78 from queue

        // we can't make the listIterator in queue
        // we can make the Iterator of the class
//        System.out.println(q.element()); // tells which element will remove in the next opearation
        Iterator<Integer> it = q.iterator();
//        System.out.println(q.peek());// tells the peek element
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println(q);


    }
}
