import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> store = new Stack<>();
        StringBuilder output = new StringBuilder();
        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            int number = in.nextInt();

            // 1. 입력값이 1일 경우
            if (number == 1) {
                int input = in.nextInt();
                store.push(input);
            }

            // 2. 입력값이 2일 경우
            if (number == 2) {
                if (!store.isEmpty()) {
                    output.append(store.pop()).append("\n");
                } else {
                    output.append("-1\n");
                }
            }

            // 3. 입력값이 3일 경우
            if (number == 3) {
                output.append(store.size()).append("\n");
            }

            // 4. 입력값이 4일 경우
            if (number == 4) {
                if (store.isEmpty()) {
                    output.append("1\n");
                } else {
                    output.append("0\n");
                }
            }

            // 5. 입력값이 5일 경우
            if (number == 5) {
                if (!store.isEmpty()) {
                    output.append(store.peek()).append("\n");
                } else {
                    output.append("-1").append("\n");
                }
            }
        }
        System.out.println(output.toString());
    }
}
