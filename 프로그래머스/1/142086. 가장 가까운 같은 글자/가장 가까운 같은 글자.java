import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> store = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char word = s.charAt(i);
            
            // put() 보다 먼저 실행되어야 하는 이유는, 맨 앞자리는 자신앞에 글자가 존재 할 수 없음
            answer[i] = i - store.getOrDefault(word, i + 1);
            
            store.put(word, i);
        }
        
        return answer;
    }
}