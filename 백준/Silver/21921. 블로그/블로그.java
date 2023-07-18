import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken()); // 블로그를 시작하고 지난 일수
        int x = Integer.parseInt(st.nextToken()); // x일 기간동안
        int[] blog = new int[n + 1];

        st = new StringTokenizer(in.readLine());

        for (int i = 1; i <= n; i++) {
            blog[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += blog[i]; // 초기 x일동안의 방문자 수
        }

        max = sum;
        count = 1;
        // 최대 방문자 수 메소드
        for (int i = x + 1; i <= n; i++) {
            // 슬라이딩 윈도우 방식으로 기간에 맞춰 합구하기
            sum = sum + blog[i] - blog[i - x];
            if (max < sum) {
                max = sum;
                count = 1;
            } else if (max == sum) {
                count++;
            }
        }

        if (max == 0) {
            System.out.println("SAD");
        } else {
            System.out.println(max);
            System.out.println(count);
        }
    }
}
