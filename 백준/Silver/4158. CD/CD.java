import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 상근
            int m = Integer.parseInt(st.nextToken()); // 선영

            if (n == 0 && m == 0) break;

            Set<Integer> store = new HashSet<>();

            for (int i = 0; i < n; i++) {
                store.add(Integer.parseInt(br.readLine()));
            }

            int cnt = 0;
            for (int i = 0; i < m; i++) {
                if (store.contains(Integer.parseInt(br.readLine()))) {
                    cnt++;
                }
            }

            sb.append(cnt).append("\n"); 
        }

        System.out.print(sb.toString());
    }
}
