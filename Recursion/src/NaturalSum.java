public class NaturalSum {
    public static void main(String[] args) {
       int n = 4, sum=0;
        int result = naturalSum(n, sum);
        System.out.println("result = "+result);

    }

    static int naturalSum(int n, int sum) {
        int a = 0;
        if(n>0){
            sum = sum + n;
            a= naturalSum(n-1,sum);
            return a;
        }
        return sum;
    }
}
