package sudhir;

public class TestStack {

    public static void main(String[] args) {

        CustomStack stack = new CustomStack(10);
        stack.push(45);
        stack.push(245);
        stack.push(435);
        stack.push(454);
        stack.push(4556);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
