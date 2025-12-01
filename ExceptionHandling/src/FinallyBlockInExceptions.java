public class FinallyBlockInExceptions {

    public static void main(String[] args){

        int a[] = new int[5];

        System.out.println("Hi ..... ");

        try{
            System.out.println(a[15]);
        }finally {
            System.out.println("Finally block in exception says, I will run always");
        }
        //good practice to close open connections or files - that is where finally block is used

        //some cases when finally block does not execute -
        //1 . Use of System.exit() method ==> Any program that you run, uske corresponding process bante hai
        // 2. An exception occurs inside the finally block
        // 3 . The death of a thread (in a multi-threaded environment) , as thread is similar to process. In a thread there are multiple processes running. When the thread gets killed, finally block won't be executed.

        System.out.println("Bye .....");

    }

}
