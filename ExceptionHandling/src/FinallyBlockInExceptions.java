public class FinallyBlockInExceptions {

    public static void main(String[] args){

        int a[] = new int[5];

        try{
            callArrayNumber(a);
        } catch(Exception e){
            System.out.println("catched the exception"+e.getMessage());
        }


    }

    static int callArrayNumber(int a[]) throws ArithmeticException{
        System.out.println("a[1] ...."+a[10]);
        return a[1];
    }

}
