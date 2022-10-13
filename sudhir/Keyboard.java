


 public class Keyboard {


    private  int price;
    private  String name;
    private int no_of_keys;


    public void setPrice(int price) {
        this.price = price;
    }
     public int getPrice() {
         return price;
     }


    public void setName(String name) {
        this.name = name;
    }
     public String getName() {
         return name;
     }

    public int getNo_of_keys() {
        return no_of_keys;
    }

    public void setNo_of_keys(int no_of_keys) {
        this.no_of_keys = no_of_keys;
    }

    public static void main(String[] args) {
     Keyboard dell = new Keyboard();
     dell.setName("naming");
     dell.setPrice(45);
     dell.setName("Dell");
     dell.no_of_keys = 4356;
        System.out.println(dell.getName());
        System.out.println(dell.getNo_of_keys());
        System.out.println(dell.getPrice());
    }



}
