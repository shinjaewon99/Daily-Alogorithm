import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        long result = 1; 
        // a부터 b까지 각 구간의 합을 계산하고 곱하기
        for (int i = a; i <= b; i++) {
            long sum = (long) i * (i + 1) / 2; 
            result = (result * sum) % 14579; 
        }

        System.out.println(result);
    }
}
