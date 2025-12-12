import java.util.*;

class MyCustomComparator implements  Comparator<Animal>{

    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight); //Integer is a wrapper class and wrapper class inside we have compare() method
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

        //You need to sort this 2D-array based on first column ke basis pe sort karna hai
        int a[][] = {
                {1,2,3},
                {9,8,7},
                {4,5,6}};


        Arrays.sort(a, (arr1,arr2) ->{
            return arr1[0] - arr2[0];
        }
        );

       for(int e[] : a){
           for(int element : e){
               System.out.print(element+"");
           }
           System.out.println();
       }


    }
}
