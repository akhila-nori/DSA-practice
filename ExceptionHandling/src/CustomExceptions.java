import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");


        try {
            int age = sc.nextInt();

            if(age > 100){
                throw new MyExceptionCustom("My custom exception is"); //new lagage ke throw karna padta hai, because you always throw an object from here
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}

class MyExceptionCustom extends Exception {
   public MyExceptionCustom(String message){
      super(message);  //parent ka constructor call (Exception class) ko pata hai abhi
   }
}
