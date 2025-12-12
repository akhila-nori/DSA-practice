import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//        Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);

        //descending order
        PriorityQueue<String> dictionary = new PriorityQueue<>((a,b)-> b.compareToIgnoreCase(a));
        dictionary.add("Akhila");
        dictionary.add("ABC");
        dictionary.add("Anila");
        dictionary.add("DEF");
        dictionary.add("GHI");

        System.out.println(dictionary);
        System.out.println(dictionary.poll());
        System.out.println(dictionary);


//        pq.add(30);
//        pq.add(40);
//        pq.add(20);
//        pq.add(10);
//
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq);
//        System.out.println(pq.poll());

    }
}
