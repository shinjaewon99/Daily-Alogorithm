import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        System.out.println(calcuResult(t));
    }

    private static long calcuResult(final int num){
        long[] numbers = new long[num + 1];

        numbers[0] = 1;

        // 점화식 도출
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                numbers[i] += numbers[j] * numbers[i - j - 1];
            }
        }

        return numbers[num];
    }
}
