
public class Animal implements Comparable<Animal> {

    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}' + "\n";
    }

    //sorting logic to compare 2 Animals - how you want to sort
    @Override
    public int compareTo(Animal that) {

        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        //current object this.age lets say , will be compared with that.age incoming object
        //compareTo() method returns an int

//        How does it interpret this integer ?
//        i) If positive integer is returned by this method --> means current object > incoming object --> i.e., current object is bigger --> places - incoming object, current object
//        ii) If negative integer is returned by this method --> means current object < incoming object --> i.e., current object is smaller --> places - current object , incoming object
//        iii) If 0 integer is returned by this method --> means current object = incoming object --> i.e., current object and incoming obj in method are equal

        return this.age - that.age; //what happened after writing this ?
          //that means if this.age > that.age --> that means positive integer is returned and ---> this.age is bigger

        //this is happy (postiive return)


    }
}