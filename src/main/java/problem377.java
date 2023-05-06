import java.util.ArrayList;
import java.util.List;

public class problem377 {
    class Solution {
        public int[] solution(int[] arr) {

            List<Integer> tempList = new ArrayList<>();

            // arr 배열의 길이 만큼 반복
            for (int i = 0; i < arr.length; i++) {
                // arr[i]의 값 만큼 반복
                for (int j = 0; j < arr[i]; j++) {
                    tempList.add(arr[i]); // tempList에 값을 담아준다.
                }
            }
            int[] answer = new int[tempList.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = tempList.get(i);
            }

            return answer;
        }
    }
}


