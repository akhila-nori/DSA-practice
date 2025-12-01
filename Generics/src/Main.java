//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog<Integer,String> d1 = new Dog<>(1,"labrador");
        Dog<Integer, String> d2 = new Dog<>(2,"german shephard");
        Dog<Integer,Integer> d3 = new Dog<>(4,5);

        }
    }

    class Dog<E,V>  { //this is how you pass Generics ka 'E' wale type ka data type
   //Dog class supports 2 types of parametrized datatypes -'E' type datatype and 'V' type datatype

    E id; // E type ka data type
    V name;  //name is having datatype of type 'V'

    public Dog(E id, V name){
        this.id=id;
        this.name = name;
    }
    }
