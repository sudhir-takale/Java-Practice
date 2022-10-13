package sudhir;


import java.util.Scanner;

class BankInfo{
    String nameofdepo;
    int accnumber;
    String type;
    int initialbalance;
    int balance = 0;

    Scanner sc = new Scanner(System.in);

    public BankInfo(String nameofdepo, int accnumber, String type) {
        this.nameofdepo = nameofdepo;
        this.accnumber = accnumber;
        this.type = type;
    }

    void initialAmount(int k){
        initialbalance = k;
        balance = initialbalance;
    }

    void depoAmount (){
        System.out.println("Enter the amount to deposit in account");
        int k = sc.nextInt();

        int balance = initialbalance + k;

    }

    void withdrawl() {
        System.out.println("Enter amount to withdrwawl");
        int with = sc.nextInt();

        if (with > balance) {
            System.out.println("You can't withdrawl ");
        } else {
            balance = balance - with;
            System.out.println("amount withdrawl sucessfully");
        }
    }

    void display(){
        System.out.println("name");
        System.out.println(balance);
        System.out.println(type);
    }



}


public class Bank {

    public static void main(String[] args) {
        BankInfo bank = new BankInfo("Sudhir", 325, "savings");
        bank.initialAmount(3456);
        bank.withdrawl();
        bank.display();

    }
}
