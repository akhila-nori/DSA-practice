import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();
        Map<String, String> mapObject = new HashMap<>(); //mapObject mein HahsMap ke mathods use kar sakte ho + Map interface ke methods bhi use kar sakte ho
            //  O(1) time compelxity or HashMap
        //key, value
        //you can define key-value pair of any type

        Map<String, String> m2 = new HashMap<>();
        m2.put("1","2");
        m2.put("2","3");
        m2.put("3","4");
        m2.put("4","5");
        m2.put("4","6");



        System.out.println("m2 is ....."+m2);



        mapObject.put("us","United States");
        mapObject.put("in","India");
        mapObject.put("us","United States");

        System.out.println( mapObject);

        m2.putAll(mapObject);
        System.out.println("New map object is ......."+m2);

        System.out.println(m2.get("1"));

        mapObject.remove("us");

        System.out.println(mapObject.containsKey("in"));

        //------------------------------------------------------------------- keys - unique that's why put in Set
        System.out.println("set of keys ....."+m2.keySet());

        Set<String> keySet = m2.keySet();
        System.out.println("keySet in set form ..."+keySet);

        //OR

        ArrayList<String> keyList = new ArrayList<>(m2.keySet()); //O(1) time complexity
        System.out.println("keySet in List form ..."+keyList);

        Collection<String> values = m2.values();
                         //returns Collection of String

        System.out.println("values = "  + values);

                      //Iterating through this collection using for-each loop
        for(String a : values){
            System.out.println("a is ........"+a);
        }

        //---------------------------------------------------------------------- values - not unique it can be duplicate, for now kept Collection. Collection can be of any type.
        //OR
        System.out.println("values in map are ......... "+m2.values());
        //values returned by map can be duplicate values

        System.out.println(mapObject);

        //entrySet - key-value pair all print --- Method -1
        System.out.println(m2.entrySet());

        //entrySet - key-value print all in Set Collection - Method -2
        //The method returns a Set because every key-value pair in a map is unique based on its key. This returned collection is called the Entry Set.

//        Set<Map.Entry<String,String>> entries = new HashSet<>(m2.entrySet()); SET - no duplicate elements
        Set<Map.Entry<String,String>> entries = m2.entrySet(); //preferred , read below
        //NOTE - v.imp whenever entry is made in map --> actually it goes as an Entry (Entry class) adn then it gets stores in the map. Entry is Class


//        Use m2.entrySet() for efficiency when you are only reading the data or if you need the changes to be linked.
//
//                Use new HashSet<>(m2.entrySet()) for safety when you plan to modify the map (m2) inside the loop.

        //iterating or traversing through set using for-each loop
        for(Map.Entry<String,String> e : entries){
            System.out.println("key is = "+e.getKey()+", value "+ e.getValue());
        }

        }
    }
