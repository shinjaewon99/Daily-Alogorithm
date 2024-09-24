import java.util.*;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        BigInteger[] fibo = new BigInteger[10001];
        fibo[0] = new BigInteger("0");
        fibo[1] = new BigInteger("1");

        for(int i = 2; i < 10001; i++){
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }

        System.out.println(fibo[number]);
       
    }
}
