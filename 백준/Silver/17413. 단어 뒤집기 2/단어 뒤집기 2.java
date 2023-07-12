import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean check = false;
        for (int i = 0; i < input.length(); i++) {
            // 여는 괄호 일경우
            if (input.charAt(i) == '<') {
                check = true;
                // 기존에 스택에 쌓인 문자 pop
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(input.charAt(i));
            }
            // 닫는 괄호 일경우
            else if (input.charAt(i) == '>') {
                check = false;
                System.out.print(input.charAt(i));
            }
            // 여는 괄호 닫는 괄호 안에있는 문자 출력
            else if (check) {
                System.out.print(input.charAt(i));
            } else {
                if (input.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(" ");
                } else {
                    stack.push(input.charAt(i));
                }
            }
        }
        // 스택에 남아있는 문자 출력
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
