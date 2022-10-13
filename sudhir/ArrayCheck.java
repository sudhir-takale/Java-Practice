package sudhir;

public class ArrayCheck {

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0] = 23;
        a[1] = 34;
        a[2] = 23;

        for (int i  = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
//    }
        for (int k : a) {
            System.out.println(k);
        }
    }
}
