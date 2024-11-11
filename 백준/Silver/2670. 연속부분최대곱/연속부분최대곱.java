import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double[] store = new double[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextDouble();
        }

        double max = store[0];
        double current = store[0];

        for(int i = 1; i < n; i++){
            current = Math.max(store[i], current * store[i]); // 현재 최대값을 dp로 접근
            max = Math.max(max, current);
        }

        System.out.printf("%.3f", max);
    }
}