
public class Main {
    public static void main(String[] args) {
         int a[] = new int[5];


        System.out.println("Hello guys ");

        try{

            int result = 5/0;

            System.out.println(a[8]);

        } catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Handling the exception .... "+e.getStackTrace());
            System.out.println("e is ..."+e.toString());
        }

        System.out.println("Bye guys ");

         }
    }
