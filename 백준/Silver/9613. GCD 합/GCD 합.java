import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        for(int i = 0; i < number; i++){
            int eachSize = in.nextInt();
            int[] eachNums = new int[eachSize];

            long sum = 0;

            for(int j = 0; j < eachSize; j++){
                eachNums[j] = in.nextInt();
            }

            // 각각의 GCD 구하기
            for(int k = 0; k < eachSize; k++){
                for(int p = k + 1; p < eachSize; p++){
                    sum += gcd(eachNums[k], eachNums[p]);
                }
            }

            System.out.println(sum);
        }
        
        
    }

    private static int gcd(final int a, final int b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }
}