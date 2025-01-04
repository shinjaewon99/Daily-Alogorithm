import java.util.*;

class Main {
    private static int[] numbers;
    private static StringBuilder output;
    private static int[] result;
    private static int size;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        output = new StringBuilder();
        
        while (true) {
            size = in.nextInt();
            if (size == 0) break; // 입력값이 0이면 탈출
            
            numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = in.nextInt();
            }
            
            result = new int[6]; // 선택된 번호를 저장할 배열
            dfs(0, 0);
            output.append("\n"); // 각 테스트 케이스 사이에 빈 줄 추가
        }
        
        System.out.print(output);
    }

    private static void dfs(int start, int depth) {
        // 로또 번호 6개를 다 찾은 경우
        if (depth == 6) {
            for (int i = 0; i < 6; i++) {
                output.append(result[i]).append(" ");
            }
            output.append("\n");
            return;
        }

        // 로또 번호 찾는 dfs
        for (int i = start; i < size; i++) {
            result[depth] = numbers[i]; // 현재 숫자를 결과에 저장
            dfs(i + 1, depth + 1); // 다음 번호 탐색
        }
    }
}
