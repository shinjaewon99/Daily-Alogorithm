import java.util.Map;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        Map<String, Integer> store = new HashMap<>();
        
        for(int i = 0; i < words.length; i++){
            
            if(i != 0){
                String word1 = words[i - 1];
                String word2 = words[i];
                
                // 2. words 배열의 문자열중 마지막 문자 추출 
                char last = word1.charAt(word1.length() - 1);
                
                // 3. words 배열의 문자열중 첫번째 문자 추출
                char start = word2.charAt(0);
                
                // 4. store의 Map 객체에 중복된 단어가 있는지 검증, 끝말잇기가 이어지는지 검증
                if(store.containsKey(word2) || last != start){
                    answer[0] = (i % n) + 1;
                    answer[1] = (i / n) + 1;
                    
                    return answer;
                }
            }  
            // 5. store라는 Map 객체의 key, value값 할당
            store.put(words[i], 1);
        }
        
        // 6. 위 조건에 해당하지않으면 배열 초기값 반환
        return answer;
    }
}