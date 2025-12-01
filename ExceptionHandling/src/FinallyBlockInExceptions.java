public class FinallyBlockInExceptions {

    public static void main(String[] args){

        int a[] = new int[5];

        System.out.println("Hi ..... ");

        try{
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("Exceptions Handled !");
        }finally {
            System.out.println("Finally block in exception says, I will run always");
        }

        System.out.println("Bye .....");

    }

}
