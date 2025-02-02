import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        long result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result += Math.abs(store[i] - store[j]);
            }
        }

        System.out.println(result);
    }
}