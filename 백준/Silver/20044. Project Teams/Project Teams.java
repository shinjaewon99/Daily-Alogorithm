import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); 
        int[] store = new int[n * 2];

        for(int i = 0; i < n * 2; i++){
            store[i] = in.nextInt();
        }

        Arrays.sort(store);
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int current = store[i] + store[2 * n - i - 1];
            result = Math.min(current, result);
        }

        System.out.println(result);
    }
}