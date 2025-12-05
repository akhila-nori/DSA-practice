import java.util.ArrayDeque;

public class ArrayDeque1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        System.out.println(dq);


    }
}
