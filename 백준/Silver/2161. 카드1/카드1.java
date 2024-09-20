import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        // q의 size가 0이 아닐때 까지 반복
        while (!(q.size() == 0)) {
            sb.append(q.poll()).append(" ");

            // 탈출조건
            if (q.size() == 0) {
                break;
            }

            // 맨위의 값은 버리고, 그 다음 숫자는 제일 아래로 옮겨서 더한다.
            q.offer(q.poll());
        }

        System.out.print(sb.toString());
    }
}