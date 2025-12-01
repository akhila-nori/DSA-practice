//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("123");
        Dog d2 = new Dog("456");

      //  Dog d3 = new Dog(12); //I can't have int datatype for Dog class ka field id, because we defined String earlier
          // To solve this problem we have generics
        }
    }

    class Dog {
    String id;
    public Dog(String id){
        this.id=id;
    }
    }
