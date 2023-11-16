import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String words = in.nextLine();

            if (words.equals(".")) break;

            System.out.println(answer(words));
        }
    }

    private static String answer(String words) {
        Stack<Character> store = new Stack<>();

        for (char word : words.toCharArray()) {
            // 1. 여는 괄호 일경우
            if (word == '(' || word == '[') {
                store.push(word);
            }

            // 2. 닫는 괄호 일경우
            else if (word == ')') {
                if (store.isEmpty() || store.peek() != '(') {
                    return "no";
                } else {
                    store.pop();
                }
            } else if (word == ']') {
                if (store.isEmpty() || store.peek() != '[') {
                    return "no";
                } else {
                    store.pop();
                }
            }
        }

        // 3. stack 객체가 비어있다는것은 괄호가 다 짝을 이룬것 or 괄호가 처음부터 없는 문자열
        if (store.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
