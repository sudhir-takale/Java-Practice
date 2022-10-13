package sudhir;

public class SubSeq {

    public static  void subSequence(String str, int index, String newString) {
        if(index == str.length()){
            System.err.println(newString);
            return;
        }

        char curr = str.charAt(index);
        subSequence(str, index+1, newString+curr);
        subSequence(str, index+1, newString);
    }




    public static void main(String args[]){
        String str = "abc";
        String newString = "";
        int idx = 0;
        subSequence(str,idx, newString);
//        System.out.println(newString);
    }
}
