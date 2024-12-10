import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        int[] store = new int[t];
        Deque<Integer> dq = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            store[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            int number = Integer.parseInt(st.nextToken());

            // 자료구조가 큐일때만
            if (store[i] == 0) {
                dq.offer(number);
            }
        }

        int putSize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < putSize; i++) {
            int putNum = Integer.parseInt(st.nextToken());
            dq.offerFirst(putNum);
            output.append(dq.pollLast()).append(" ");
        }

        System.out.println(output.toString().trim());
    }
}
