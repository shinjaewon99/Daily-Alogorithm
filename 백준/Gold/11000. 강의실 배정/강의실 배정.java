import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 1. N개의 수업 입력
        int n = Integer.parseInt(in.readLine());
        int[][] time = new int[n][2];


        // 2. 조건에 맞게 정렬
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine());
            time[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            time[i][1] = Integer.parseInt(st.nextToken()); // 종료 시간
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 시작 시간이 같은경우
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1]; // 종료시간이 짧은 순으로
                }
                return o1[0] - o2[0];
            }
        });


        // 3. 최소의 강의실 갯수 구하기
        // 우선순위 큐 사용 (시간 초과 방지)
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int endTime = time[0][1];
        queue.add(endTime);


        for (int i = 1; i < n; i++) {
            if (queue.peek() <= time[i][0]) {
                queue.poll();
            }
            // 시작 시간이 빠른순으로 정렬된 배열에서 종료 시간을 담는다.
            queue.add(time[i][1]);
        }
        System.out.println(queue.size());
    }
}
