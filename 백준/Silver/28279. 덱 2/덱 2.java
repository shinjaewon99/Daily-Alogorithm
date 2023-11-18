import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> store = new ArrayDeque<>();
        StringBuilder output = new StringBuilder();

        // 1. 명령의 수 입력
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            int number = in.nextInt();

            // 2. 입력이 1일 경우
            if (number == 1) {
                int firstInput = in.nextInt();
                store.addFirst(firstInput);
            }

            // 3. 입력이 2일 경우
            if (number == 2) {
                int lastInput = in.nextInt();
                store.addLast(lastInput);
            }

            // 3. 입력이 3일 경우
            if (number == 3) {
                if (!store.isEmpty()) {
                    output.append(store.pollFirst()).append("\n");
                }else{
                    output.append(-1).append("\n");
                }
            }

            // 4. 입력이 4일 경우
            if (number == 4) {
                if (!store.isEmpty()) {
                    output.append(store.pollLast()).append("\n");
                }else{
                    output.append(-1).append("\n");
                }
            }

            // 5. 입력이 5일 경우
            if (number == 5) {
                output.append(store.size()).append("\n");
            }

            // 6. 입력이 6일 경우
            if (number == 6) {
                if (store.isEmpty()) {
                    output.append(1).append("\n");
                } else {
                    output.append(0).append("\n");
                }
            }

            // 7. 입력이 7일 경우
            if (number == 7) {
                if (!store.isEmpty()) {
                    output.append(store.peekFirst()).append("\n");
                }else{
                    output.append(-1).append("\n");
                }
            }

            // 8. 입력이 8일 경우
            if (number == 8) {
                if (!store.isEmpty()) {
                    output.append(store.peekLast()).append("\n");
                }else{
                    output.append(-1).append("\n");
                }
            }
        }
        System.out.println(output.toString());
    }
}
