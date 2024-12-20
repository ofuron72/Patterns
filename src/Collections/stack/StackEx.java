package Collections.stack;

import java.util.Stack;

public class StackEx {
    //устаревший, synchronized, принцип LIFO
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(6);
        stack.push(1);
        stack.push(8);
        stack.push(5);

        System.out.println(stack);

        stack.pop();//удаляется последний
        System.out.println(stack);
        System.out.println(stack.peek());//peek конец выводит стека

    }

}
