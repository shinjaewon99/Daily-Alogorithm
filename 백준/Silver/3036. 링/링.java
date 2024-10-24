import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        // 첫번째 원 반지름
        int r1 = numbers[0];

        for(int i = 1; i < n; i++){
            int currentR1 = r1;
            int currentR2 = numbers[i];

            int value = gcd(r1, currentR2);

            System.out.println((currentR1 / value) + "/" + (currentR2 / value));
        }
    }

    private static int gcd(final int x, final int y){
        if(y == 0) return x;

        return gcd(y, x % y);
    }
}