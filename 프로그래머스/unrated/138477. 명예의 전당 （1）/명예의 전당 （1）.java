import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            // 1. list 객체에 score 배열 값 저장
            list.add(score[i]);
          
            if(list.size() > k){
                // 2. list 객체에 저장된 score 배열중 최소값 제거
                list.remove(Collections.min(list));
            }
            // 3. 명예의 전당의 수에 맞춰 최소값을 answer 배열에 저장
            answer[i] = Collections.min(list);
        }
        
        return answer;
    }
}