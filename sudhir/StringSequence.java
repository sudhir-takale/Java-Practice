package sudhir;

public class StringSequence {
    public static void main(String[] args) {
        printSeq("", "abc");

    }

    static void printSeq(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);

        }
        char ch = up.charAt(0);

        printSeq(p + ch, up.substring(1));
        printSeq(p, up.substring(1));

    }

}
