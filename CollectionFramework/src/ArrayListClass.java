import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

//        List<Integer> list2 = new ArrayList<>();

        //------------------------************---------------------
        //Collection interface methods call
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);


//        list2.add(10);
//        list2.add(2);
//        list2.add(3);
//
//
//        System.out.println(list2);
//
//        list2.removeAll(list);

        //ARRAYLIST TO BE CONVERTED TO ARRAY OBJECT
        Object a[] = list.toArray(); //convertes Arraylist (list) ---->  to Array Object 'a'
        for(Object e :a){
            Integer temp = (Integer)e;
            System.out.println(e);
        }

        System.out.println(a);

        //------------------------************---------------------

        //List interface methods call
        System.out.println(list.get(0));
        list.set(1,200);

        list.add(2,1000);

        list.remove(Integer.valueOf(1));

        System.out.println(list.indexOf(Integer.valueOf(100)));

        System.out.println(list);
        //Big0(N) -- time compelxity


        //------------------------************---------------------

        //List Iterator
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Papaya");
        fruits.add("Mango");

        //now I want iterate over it one by one

        //Method -1 - for loop
        for(int i=0; i < fruits.size(); i++){
//            System.out.println("fruit is "+fruits.get(2));
            System.out.println(fruits);
            System.out.println("fruit is "+fruits.get(i) + "\tand index of that fruit is .."+i);
        }

        //Method -1 - for each loop
        for(String fruit: fruits){
            System.out.println("for each fruit "+fruit+ " and index of that fruit is ....."+fruit.indexOf(fruit)); // you are calling the indexOf() method on the String object - fruit, not on the List object (fruits)
           // Since you are searching for the entire string within itself (e.g., finding the substring "Kiwi" inside the string "Kiwi"),
            // the starting index will always be 0.
           //Example - "Kiwi".indexOf("Kiwi") = 0



            System.out.println("for each fruit "+fruit+ " and index of that fruit is ....."+fruits.indexOf(fruit));
            //Example = [Kiwi, Apple, Papaya, Mango].indexOf("Kiwi") = 0
            //Example = [Kiwi, Apple, Papaya, Mango].indexOf("Apple") = 1
        }




    }
}
