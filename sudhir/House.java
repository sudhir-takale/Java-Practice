import  java.util.Scanner;

public class House {
  int price;
  String address;
  float size;
  byte no_of_rooms;
  byte no_of_windows;

  Scanner sc = new Scanner(System.in);
  void setData(){
      System.out.println("Enter the price of your house :");
      price = sc.nextInt();
      System.out.println("Enter the location of house :");
      address =  sc.next();
      System.out.println("Enter how many rooms are there in house :");
      no_of_rooms = sc.nextByte();
      System.out.println("Enter how many windows in house :");
      no_of_windows = sc.nextByte();
  }

  void getData(){
      System.out.println("The price of house is " + price);
      System.out.println(address + " at this location house is located ");
      System.out.println("There are " + no_of_rooms + " in house ");
      System.out.println("There are " + no_of_rooms + " in house ");
  }




    public static void main(String[] args) {
  House sudhir = new House();
  sudhir.setData();
  sudhir.getData();

    }
}
