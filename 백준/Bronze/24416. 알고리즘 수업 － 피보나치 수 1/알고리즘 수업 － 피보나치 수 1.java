import java.util.*;

public class Main {
    private static int count1 = 0;
    private static int count2 = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        fib(number);
        fibo(number);
        System.out.print(count1 + " ");
        System.out.print(count2);
    }

    private static int fib(int number) {
        if(number == 1 || number == 2) {
            count1++;
            return 1;
        }else {
            return (fib(number - 1) + fib(number - 2));
        }
    }

     private static int fibo(int number) {
        int[] dp = new int[number];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < number; i++){
            count2++;
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        return dp[number - 1];
    }
    
}