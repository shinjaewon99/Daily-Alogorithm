import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder output = new StringBuilder(); 

        int t = in.nextInt(); // 문제의 수
        while (t-- > 0) {
            int n = in.nextInt();
            output.append(getSum(n)).append("\n"); 
        }

        System.out.print(output.toString()); 
    }

    private static long getSum(int n) {
        return sumDiv(n, 3) + sumDiv(n, 7) - sumDiv(n, 21);
    }

    private static long sumDiv(int n, int k) {
        long m = n / k; // k의 배수 개수
        return k * m * (m + 1) / 2; // 등차수열 합 공식 적용
    }
}
