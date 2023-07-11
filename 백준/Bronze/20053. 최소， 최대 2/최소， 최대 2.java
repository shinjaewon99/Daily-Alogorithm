import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());

        while (size-- > 0) {
            int n = Integer.parseInt(in.readLine()); // 정수 갯수
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(in.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());

            }
            Arrays.sort(arr);

            System.out.print(arr[0] + " " + arr[arr.length - 1]);
            System.out.println();
        }
    }
}
