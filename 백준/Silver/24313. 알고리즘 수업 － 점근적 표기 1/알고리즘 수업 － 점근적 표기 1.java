import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] f = input.readLine().split(" ");
        int f1 = Integer.parseInt(f[0]);
        int f2 = Integer.parseInt(f[1]);
        int c = Integer.parseInt(input.readLine());
        int n = Integer.parseInt(input.readLine());

        int tempA = f1 * n + f2;
        int tempB = c * n;

        if (tempA <= tempB && f1 <= c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
