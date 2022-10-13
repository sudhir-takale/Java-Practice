
//Generally this is program of next palindrome number if the given number is not palindrome

package sudhir;

public class NextFibo {
    public static void main(String[] args) {
  fibo(89);

    }

     static void fibo(int n){
        int temp = n;
        int rev = 0, rem;
        int k = n;

        while(n > 0){
            rem = n%10;
            rev = rev*10  + rem;
            n  = n/10;
        }
        if(temp == rev){
            System.out.println(rev+" The given number is palindrome");
        }
        else{
            fibo(k+1);
        }
    }

}
