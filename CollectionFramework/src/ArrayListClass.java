import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));

        list.remove(Integer.valueOf(1)); //returns Integer object 1 (here object is returned)
         //takes object and removes the object , it creates an INTEGER OBJECT with the value 1

        //The remove(Object o) method searches your list ([10, 20, 30]) for an element that is equal to the number 1.
        //Since the number 1 is not in your list, the remove() method does nothing and returns false.

        System.out.println(list);


    }
}
