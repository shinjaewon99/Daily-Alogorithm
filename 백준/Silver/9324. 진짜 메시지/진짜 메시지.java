import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            int[] alpha = new int[26];
            String str = br.readLine();
            String msg = "OK";
            boolean flag = false;
            for (int j = 0; j < str.length(); j++) {
                // 입력값 ABAAAB 인경우 4번째 A는 건너 뛰어야합니다.
                if (flag) {
                    flag = false;
                    continue;
                }
                alpha[str.charAt(j) - 'A']++; // 알파벳 증가

                // 똑같은 알파벳이 3개 있는경우
                if (alpha[str.charAt(j) - 'A'] == 3) {
                    // 똑같은 3개 알파벳이 있는데 다음 입력이 없는경우
                    if (j == str.length() - 1) {
                        msg = "FAKE";
                        break;
                    }
                    // 똑같은 3개 알파벳이 있는데 3개기준으로 앞의 문자가 다른경우
                    else if (str.charAt(j) != str.charAt(j + 1)) {
                        msg = "FAKE";
                        break;
                    }
                    flag = true;
                    alpha[str.charAt(j) - 'A'] = 0; // 3개 검증후 초기화
                }
            }
            System.out.println(msg);
        }
    }
}