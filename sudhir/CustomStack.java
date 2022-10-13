package sudhir;

public class CustomStack {

    int data[];

    int size;

    int ptr = -1;

    CustomStack(int size) {

        data = new int[size];
    }

    public boolean push(int val) {

        if (isFull()) {

            System.out.println("You can't add element in the stack");
            return false;
        }

        ptr++;
        data[ptr] = val;
        return true;
    }


    public int pop() {

        if (isEmpty()) {
            System.out.println("can't remove from stack");
            return -1;
        }
        int removed = data[ptr];
        return removed;

    }

    private boolean isFull() {
        ptr = data.length - 1;
        return false;
    }

    private boolean isEmpty() {

        if (ptr == -1) {
            return false;
        }
        return false;
    }


}
