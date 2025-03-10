import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int q = in.nextInt();

        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        Arrays.sort(store);
        
        // 누적합
        int[] sum = new int[n + 1];

        for(int i = 1; i <= n; i++){
            sum[i] = sum[i - 1] + store[i - 1];
        }

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < q; i++){
            int start = in.nextInt();
            int end = in.nextInt();
    
            int result = 0;
            result += sum[end] - sum[start - 1];
            output.append(result).append("\n");
          
        }

        System.out.println(output.toString());
    }
}