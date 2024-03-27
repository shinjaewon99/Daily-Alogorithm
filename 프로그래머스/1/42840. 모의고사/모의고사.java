import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> store = new ArrayList<>();
        int[] answer = new int[3];
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 1. 찍는 방법에 따라 맞힌 갯수를 세어 준다.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[i % 5]) {
                answer[0]++;
            }
            if (answers[i] == second[i % 8]) {
                answer[1]++;
            }
            if (answers[i] == third[i % 10]) {
                answer[2]++;
            }
        }

        // 2. 문제를 가장 많이 맞힌 갯수를 저장한다.
        int max = Arrays
                .stream(answer)
                .max()
                .orElse(0);

        for (int i = 0; i < answer.length; i++) {
            if(answer[i] == max){
                store.add(i + 1);
            }
        }

        // 3. store 객체를 정수형 배열로 변환 한다.
        return store.stream().mapToInt(Integer::intValue).toArray();
    }
}