import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Stack <Integer> store = new Stack<>();
        StringBuilder result = new StringBuilder();
        int size = in.nextInt();

        // 시작 숫자
        int start = 1;
        
         for (int i = 0; i < size; i++) {
            int putNumber = in.nextInt();

            // 필요한 수까지 스택에 push
            while (start <= putNumber) {
                store.push(start);
                result.append("+").append("\n");
                start++;
            }

            // 스택에서 꺼낼 수 있는지 확인
            if (store.peek() == putNumber) {
                store.pop();
                result.append("-").append("\n");
            } else {
                // 수열을 만들 수 없는 경우
                System.out.println("NO");
                return;
            }
        }

        System.out.println(result.toString());
        
    }
}