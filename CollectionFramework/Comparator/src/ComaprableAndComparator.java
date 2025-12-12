import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComaprableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4,"leo",10);
        Animal a2 = new Animal(7,"Bruno",20);
        Animal a3 = new Animal(3,"Maxo",25);
        Animal a4 = new Animal(9,"Don",5);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);


        //sorting Method -1 --> List inherits Collection and collection interface provides us the method sort()
        // Sorts by age in ascending order
//        dogs.sort((a, b) -> Integer.compare(az, b.getWeight()));
        dogs.sort(Comparator.naturalOrder());
//        How it Works Internally:
//        The dogs.sort() method receives the naturalOrder() comparator.
//
//                The naturalOrder() comparator knows that the elements in the list are expected to implement the Comparable interface.
//
//        The comparator repeatedly calls the compareTo(Object o) method that you defined inside your Animal class (e.g., comparing ages, names, or weights) to determine the correct sorted position of each element.
//

       // By using naturalOrder(), you are leveraging the sorting logic you chose for the Animal class (e.g., sorting by age) and applying it to the list without writing a new comparison lambda.


        System.out.println("List .... "+dogs);
        for (Animal d : dogs) {
            System.out.println(d);

        }
    }
}
