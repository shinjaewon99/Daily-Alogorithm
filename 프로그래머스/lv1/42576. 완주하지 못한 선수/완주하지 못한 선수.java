import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        StringBuilder answer = new StringBuilder();
        int participantLength = participant.length;
        int completionLength = completion.length;
                
        Map<String, Integer> store = new HashMap<>();
        
        // 1. 참가자와 완주자를 map 객체에 저장
        for(int i = 0; i < participantLength; i++){
            store.put(participant[i], store.getOrDefault(participant[i], 0) + 1);
        }

        // 2. map 객체의 value값을 빼준다.
        for(int i = 0; i < completionLength; i++){
            store.put(completion[i], store.get(completion[i]) - 1);
        }
        
        
        // 3. 참가자, 완주자 배열에 동시에 있으면 value 값이 0이어야 한다
        // 그러므로 0이 아니면 완주자가 아님
        for(String name : store.keySet()){
            if(store.get(name) != 0) answer.append(name);
        }
        
        return answer.toString();
    }
}