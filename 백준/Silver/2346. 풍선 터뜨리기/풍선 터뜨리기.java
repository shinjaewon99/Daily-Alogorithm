import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = Integer.parseInt(br.readLine()); // 풍선의 갯수

        // 풍선의 index와 번호를 동시에 알아야됨으로 2차원 배열
//        for (int i = 0; i < N; i++) {
//            arr[i][0] = i + 1;
//            arr[i][1] = in.nextInt();
//        }

        ArrayDeque<int[]> list = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            list.add(new int[]{i, num});
        }

        // 3 2 1 -3 -1
        // -3 -1 2 1
        // -1 2 1
        // 1 2
        // 2
        while (list.size() > 1) {
            int[] current = list.pollFirst();
            bw.write(current[0] + " "); // 풍선의 index값
            int number = current[1]; // 풍선의 번호

            // 풍선의 번호가 양수인 경우
            if (number > 0) {
                for (int j = 1; j < number; j++) {
                    list.offerLast(list.pollFirst()); // 뒤에있는 배열의 값을 앞순서로 배치한다.
                }
            }
            // 풍선의 번호가 음수인 경우
            else if (number < 0) {
                for (int j = number; j < 0; j++) {
                    list.offerFirst(list.pollLast());
                }
            }
        }

        // list에 남은 풍선 index를 삽입
        bw.write(list.poll()[0] + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
