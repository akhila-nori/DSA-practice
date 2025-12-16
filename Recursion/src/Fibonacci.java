public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int result = fibonacci(n);
        System.out.println("result = "+result);
    }

    static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
