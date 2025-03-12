import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int k = in.nextInt();

        System.out.println(getResult(s, k));
    }

    private static long getResult(int s, int k){
        long result = 1;
        int div = s / k;
        int mod = s % k;

        for(int i = 0; i < k; i++){
            // 더 큰 숫자가 필요한 경우
            if(i < mod){
                result *= (div + 1);
            }else{
                result *= div;
            }
        }

        return result;
    }
}