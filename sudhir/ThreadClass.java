package sudhir;
import java.lang.Thread;
class ThreadTest extends Thread{
    static int variable = 5;
    static final Object lock = new Object();
    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i * variable);
            }
            variable++;
        }
        System.out.println("Next thread start at this time");

    }



}


public class ThreadClass {
    public static void main(String[] args) {

       Thread r = new ThreadTest();
        Thread t = new Thread(r);
        Thread k = new Thread(r);
        Thread m = new Thread(r);

        t.start();
        k.start();
        m.start();


    }
}
