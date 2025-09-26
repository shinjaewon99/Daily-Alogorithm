import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] value = new int[n];
        Integer[] index = new Integer[n];
        for (int i = 0; i < n; i++) {
            value[i] = Integer.parseInt(br.readLine());
            index[i] = i; // 원래 인덱스
        }

        // 인덱스 배열을 값 기준으로 정렬
        Arrays.sort(index, (a, b) -> Integer.compare(value[a], value[b]));

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, index[i] - i);
        }

        System.out.println(answer + 1);
    }
}
