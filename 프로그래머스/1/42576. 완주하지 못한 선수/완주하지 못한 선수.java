import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        
        Map<String,Integer> store = new HashMap<>();
        
        // 1. Map 객체에 참여자 명단 저장
        for(int i = 0; i < participant.length; i++){
            store.put(participant[i], store.getOrDefault(participant[i], 0) + 1);
        }
        
        // 2. Map 객체에 저장된 참여자 명단에서 완주자 명단을 뺀다.
        for(int i = 0; i < completion.length; i++){
            store.put(completion[i], store.getOrDefault(completion[i], 0) - 1);
        }
        
        for(String compare : store.keySet()){
            if(store.get(compare) != 0){
                answer.append(compare);
                break; // 완주하지 못한 선수를 찾으면 반복문을 종료
            }
        }
        
        
        return answer.toString();
    }
}