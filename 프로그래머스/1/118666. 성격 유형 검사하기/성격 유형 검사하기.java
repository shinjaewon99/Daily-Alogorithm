import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> store = new HashMap<>();
        // 1. 초기화
        store.put('R', 0);
        store.put('T', 0);
        store.put('C', 0);
        store.put('F', 0);
        store.put('J', 0);
        store.put('M', 0);
        store.put('A', 0);
        store.put('N', 0);
        
        for(int i = 0; i < choices.length; i++){
            // 2. 성격유형 문자 반환
            char type1 = survey[i].charAt(0);
            char type2 = survey[i].charAt(1);
            
            // 3. 점수가 4점 보다 클 경우
            if(choices[i] > 4){
                store.put(type2, store.get(type2) + (choices[i] - 4));
            }else if(choices[i] < 4){
                store.put(type1, store.get(type1) + (4 - choices[i]));
            }
        }
        String answer = sortAnswer(store);
        return answer;
    }
    
    private String sortAnswer(Map<Character, Integer> store){
        StringBuilder answer = new StringBuilder();
        
        // 4. 번호 순서대로 임으로, 비교하여 answer 변수에 저장
        if(store.get('R') >= store.get('T')){
            answer.append('R');
        }else{
            answer.append('T');
        }
        
        if(store.get('C') >= store.get('F')){
            answer.append('C');
        }else{
            answer.append('F');
        }
        
        if(store.get('J') >= store.get('M')){
            answer.append('J');
        }else{
            answer.append('M');
        }
        
        if(store.get('A') >= store.get('N')){
            answer.append('A');
        }else{
            answer.append('N');
        }
         
        return answer.toString();
    }
}