import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Queue<Integer> q = new LinkedList<>();

     q.offer(10);
     q.offer(20);
     q.offer(30);
     q.offer(40);

//     while(!q.isEmpty()){
//         System.out.println(q.poll());
//     }
//
//        System.out.println(q.poll());


     System.out.println(q);

     System.out.println(q.poll());
     System.out.println(q);
     System.out.println(q.peek());

    }
}