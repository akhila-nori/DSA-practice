public class NaturalSum {
    public static void main(String[] args) {
       int n = 4;
        int result = naturalSum(n);
        System.out.println("result = "+result);

    }

    static int naturalSum(int n) {
        if(n==1) return 1;
        else {
            return naturalSum(n-1)+n;
        }
    }
}
