import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 연산의 갯수

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // 먼저 입력한 값의 절대값이 크면
                if (Math.abs(o1) > Math.abs(o2)) {
                    return Math.abs(o1) - Math.abs(o2);
                }
                // 절대값이 같으면 음수 먼저
                else if(Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }
                return -1;
            }
        });

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            // 입력값이 0인경우
            if (input == 0) {
                // 큐가 비어있는경우
                if (queue.isEmpty()) {
                    output.append(0).append("\n");
                }
                // 큐가 비어있지 않으면 큐 값 poll
                else {
                    output.append(queue.poll()).append("\n");
                }
            }else {
                queue.offer(input);
            }
        }

        System.out.println(output.toString());
    }
}
