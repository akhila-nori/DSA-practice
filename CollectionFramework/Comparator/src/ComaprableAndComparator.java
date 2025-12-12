import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyCustomComparator implements  Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.weight - o2.weight;
    }
}

public class ComaprableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(4,"leo",10);
        Animal a2 = new Animal(4,"Bruno",20);
        Animal a3 = new Animal(3,"Maxo",25);
        Animal a4 = new Animal(9,"Don",5);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);


//        Collections.sort(dogs);

        Collections.sort(dogs,new MyCustomComparator());

        System.out.println("List .... "+dogs);
        for (Animal d : dogs) {
            System.out.println(d);

        }
    }
}
