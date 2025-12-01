
public class Main {
    public static void main(String[] args) {
         int a[] = new int[5];


        System.out.println("Hello guys ");

        try{

            int result = 5/0;

            System.out.println(a[8]);

        } catch(Exception e){
            //parent class - Exception passed here

            System.out.println("Handling all exceptions .... "+e.getStackTrace()+"\n");

            e.printStackTrace();
        }

        System.out.println("Bye guys ");

         }
    }
