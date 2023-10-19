import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 집합의 크기
        int size = in.nextInt();
        int[] store = new int[size];

        for(int i = 0; i < size; i++){
            store[i] = in.nextInt();
        }
        Arrays.sort(store);

        // 2. 집합에 포함되는 정수
        int match = in.nextInt();

        // 3. 좋은 구간을 시작할 인덱스
        int startIndex = 0;
        for (int find : store) {
            if(match > find){
                startIndex++;
            }
        }

        // 4. 시작, 끝 값 할당
        int start = 0;
        if(startIndex == 0){
            start = 0;
        }else{
            start = store[startIndex - 1];
        }
        int end = store[startIndex];

        int answer = 0;

        // 5. A 구간 탐색
        for (int i = start + 1; i <= match; i++) {
            // 6. B 구간 탐색
            for (int j = match; j < end; j++) {
                // 7. [2,2] 일경우 스킵
                if(i == j){
                    continue;
                }
                answer++;
            }
        }

        System.out.println(answer);
    }
}
