import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        // 1. 문자와 인덱스를 담을 store 객체 선언
        Map<Character, Integer> store = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            // 2. store 맵 객체에 문자가 없을경우 i + 1 반환
            // 해당하는 문자가 있을경우 value 반환
            answer[i] = i - store.getOrDefault(sChar, i + 1);
            store.put(sChar, i);
        }
        
        return answer;
    }
}