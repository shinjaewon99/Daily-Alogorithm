import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 칭호 개수
        int m = Integer.parseInt(st.nextToken()); // 캐릭터 개수

        TreeMap<Integer, String> store = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            int power = Integer.parseInt(st.nextToken());

            // 동일한 power 값이 있으면 기존 value 유지
            store.putIfAbsent(power, title);
        }

        for (int i = 0; i < m; i++) {
            int compare = Integer.parseInt(br.readLine());

            // 해당 power보다 크거나 같은 최소 key 값의 entry 가져오기
            output.append(store.ceilingEntry(compare).getValue()).append("\n");
        }

        System.out.print(output.toString());
    }
}
