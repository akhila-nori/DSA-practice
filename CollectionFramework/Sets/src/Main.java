import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();    //O(1) time complexity
//        Set<Integer> set = new LinkedHashSet<>();  //O(n) time complexity
        Set<Integer> set = new TreeSet<>(); // O(log n) time complexity
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(5);
        System.out.println(set);

        set.remove(10);
        System.out.println(set.contains(10));;
        System.out.println(set);

        }
    }
