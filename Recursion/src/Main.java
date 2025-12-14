//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    fun(4);

    }

    static void fun(int n){

        if(n>0){
            System.out.println(n);
            fun(n-1);
        }
    }
}