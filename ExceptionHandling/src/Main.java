
public class Main {
    public static void main(String[] args) {
         int a[] = new int[5];


        System.out.println("Hello guys ");

        try{

            int result = 5/0;

            System.out.println(a[8]);

        } catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Handling the exception .... "+e.getStackTrace()+"\n");


//            System.out.println("Handling the exception .... "+e.printStackTrace()); --> Error line

            //why Reasoning :-
            // e.printStackTrace() --> this completes task but gives no value back --> Void (No value retrned
            // Here you are asking the printStackTrace() to deliver the stack trace (message) to the console
            // the return type to be delivered to
            // Action 2: Execute the stack trace printing (Void)

            e.printStackTrace();// This is an action, not a value. It's valid on its own line.
        }

        System.out.println("Bye guys ");

         }
    }
