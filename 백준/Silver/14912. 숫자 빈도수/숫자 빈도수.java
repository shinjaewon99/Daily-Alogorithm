import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int num = Integer.parseInt(input[0]);
        int find = Integer.parseInt(input[1]);

        int count = 0;
        for (int i = 1; i <= num; i++) {
            int temp = i; // 11같은 경우를 위해 변수 할당

            while (temp > 0) {
                // 모듈 연산한 수가 find랑 같을경우
                if (temp % 10 == find) {
                    count++;
                }
                temp /= 10;
            }
        }
        System.out.println(count);
    }
}
