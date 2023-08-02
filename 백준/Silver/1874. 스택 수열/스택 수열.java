import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int size = in.nextInt();
        int start = 0;
        for (int i = 0; i < size; i++) {

            int value = in.nextInt();

            if (value > start) {
                for (int j = start + 1; j <= value; j++) {
                    stack.push(j); // 스택에 start + 1 부터 값 저장
                    sb.append("+").append("\n");
                }
                start = value; // start를 value값으로 초기화
            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb.toString());
    }
}