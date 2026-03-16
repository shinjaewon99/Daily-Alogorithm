import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] result = new int[n + 1];

        for(int i = 1; i <= n; i++){
            result[i] = i;
        }
        
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();

            // swap
            int temp = result[a];
            result[a] = result[b];
            result[b] = temp;
        }

        for(int i = 1; i <= n; i++){
            System.out.print(result[i] + " ");
        }
    }
}