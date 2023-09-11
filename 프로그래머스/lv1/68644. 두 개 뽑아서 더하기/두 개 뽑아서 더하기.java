import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        
        // 1. Set 객체를 선언하여 중복되는 합을 제거한다.
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                set.add(sum);
            }
        }
        
        // 2. Set 객체를 List 객체로 옮겨 담기
        List<Integer> list = new ArrayList<>(set); 
        int[] answer = new int[list.size()];
        
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}