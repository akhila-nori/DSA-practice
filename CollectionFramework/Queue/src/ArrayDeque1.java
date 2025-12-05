import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDeque1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        dq.offer(10);
//        dq.offerLast(20);
//        dq.offerFirst(30);
//        System.out.println(dq);
//
//        dq.pollLast();
//        System.out.println(dq);


        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack is ..... "+stack);
        System.out.println("peek in stack is ......"+ stack.peek());

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue is ....."+queue);
        System.out.println("peek in queue is ......"+ queue.peek());





    }
}
