import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);


        list2.add(1);
        list2.add(2);
        list2.add(3);


        System.out.println(list2);

        list2.addAll(list);
        System.out.println(list2);


    }
}
