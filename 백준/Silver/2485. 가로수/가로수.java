import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        // 간격 구하기
        int[] depth = new int[n - 1];

        for(int i = 0; i < n - 1; i++){
            depth[i] = numbers[i +  1] - numbers[i]; 
        }

        // 모든 간격의 최대 공약수 구하
        int value = depth[0];
        for (int i = 1; i < depth.length; i++) {
            value = gcd(value, depth[i]);
        }

        int cnt = 0;

        for(int result : depth){
            cnt += (result / value) - 1;
        }

        System.out.println(cnt);
    }

    private static int gcd(int a, int b) {
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }
}