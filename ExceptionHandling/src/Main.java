
public class Main {
    public static void main(String[] args) {
         int a[] = new int[5];


        System.out.println("Hello guys ");

        try{

            int result = 5/0;

            System.out.println(a[8]);

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Tried to access the out of bound element"+e.getStackTrace());
            System.out.println("e is ..."+e.toString());
        } catch(ArithmeticException e){
            System.out.println("arithmetic exception ...."+e.getMessage());
        }

        System.out.println("Bye guys ");
        
         }
    }
