
import java.util.HashMap;
import java.util.Scanner;

public class problem156 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // 테스트 갯수 입력
        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int size = in.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            for (int j = 0; j < size; j++) {
                String n = in.next();
                String m = in.next();
                // 아무것도 안입은 상태도 갯수로 세어준다.
                map.put(m, map.getOrDefault(m, 1) + 1);
            }
            int answer = 1;
            for (String s : map.keySet()) {
                int k = map.get(s);
                answer *= k;
            }
            // 알몸인 상태 1가지 경우를 빼준다.
            System.out.println(answer - 1);
        }
    }
}
