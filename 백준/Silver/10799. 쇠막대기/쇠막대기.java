import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        // 1. 쇠막대기와 레이저의 배치 입력
        String input = br.readLine();

        // 2. 스택에 input 길이 만큼 조건부 할당
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // 여는 괄호 일 경우
            if (ch == '(') {
                stack.add(ch);
            } else {
                stack.pop();
                // 이전 문자가 여는 괄호일 경우
                if (input.charAt(i - 1) == '(') {
                    result += stack.size();
                }
                // ')' 닫는괄호가 연속으로 나올경우
                else {
                    result++;
                }
            }

        }
        // 예시 (()()) -> 3 출력

        // 3. 결과값 출력
        System.out.println(result);
    }
}
