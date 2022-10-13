package sudhir;


class LL {

    Node head;
    Node tail;

    void displau() {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.val + "-->");
            temp = temp.next;

        }
    }
    void insertAtEnd(int k){

        Node node = new Node(k);
        node.val = k;
        tail.next = node;
        tail = node;
        tail.next = null;

    }
    void insertAtHead(int k) {

        Node s = new Node(k);
        s.val = k;
        if (head == null) {


            head = s;
            tail = s;
            head.next = null;
        }


        s.next = head;
        head = s;


    }


    class Node {

        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }


}


public class LinkedList {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertAtHead(67);
        list.insertAtHead(34);
        list.insertAtHead(67);
        list.insertAtHead(12);
        list.insertAtHead(89);
        list.insertAtEnd(11);
        list.insertAtEnd(22);
        list.insertAtHead(00);
        list.displau();

    }
}
