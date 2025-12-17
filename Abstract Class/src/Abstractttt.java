//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Abstractttt {
    public static void main(String[] args) {

//        Vehicle v1 = new Vehicle();

        Car c1 = new Car();
        c1.accelerate();
        c1.brake(4);
        c1.honks();


    }
}

abstract class Vehicle {

    abstract void accelerate(); //function is declared only, not defined

    abstract int brake(int wheels);

    void honks(){
        System.out.println("Vehicle honks .... ");
    }

}

class Car extends Vehicle{

    @Override
    void accelerate() {

    }

    @Override
    int brake(int w) {
      return w;
    }

    void honks(){
        System.out.println("Car is honking .....");
    }
}