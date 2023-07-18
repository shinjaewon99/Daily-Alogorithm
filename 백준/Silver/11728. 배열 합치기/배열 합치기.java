import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 배열 A의 크기
        int m = in.nextInt(); // 배열 B의 크기
        int[] result = new int[n + m];
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result[i] = in.nextInt();
        }
        // 3 5
        for (int i = 0; i < m; i++) {
            result[i + n] = in.nextInt();
        }
        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) {
            output.append(result[i]).append(" ");
        }

        System.out.println(output.toString());
        
    }
}
