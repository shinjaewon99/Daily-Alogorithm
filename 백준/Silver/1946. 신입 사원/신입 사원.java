import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[][] graph = new int[n][2];

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                graph[i][0] = Integer.parseInt(st.nextToken()); // 서류
                graph[i][1] = Integer.parseInt(st.nextToken()); // 면접
            }

            // 서류 기준 정렬 (오름차순)
            Arrays.sort(graph, (a, b) -> a[0] - b[0]);

            int count = 1; // 첫 번째 지원자는 항상 선발
            int minScore = graph[0][1];

            for (int j = 1; j < n; j++) {
                if (graph[j][1] < minScore) {
                    count++;
                    minScore = graph[j][1];
                }
            }

            output.append(count).append("\n");
        }

        System.out.print(output);
    }
}
