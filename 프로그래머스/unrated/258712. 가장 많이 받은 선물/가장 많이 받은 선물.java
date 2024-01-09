import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        // 선물을 받은 갯수
        Map<String, Integer> presentStore = new HashMap<>();
        
        // 선물 지수
        Map<String, Integer> presentLog = new HashMap<>();
        
        // 선물 지수와 선물 갯수 비교
        Map<String, Map<String, Integer>> record = new HashMap<>();
        
        // 1. Map 객체 초기화
        for(int i = 0; i < friends.length; i++){
            presentStore.put(friends[i], 0);
            presentLog.put(friends[i], 0);
            record.put(friends[i], new HashMap<>());
        }
        
        
        for(String gift : gifts){
            String[] names = gift.split(" ");
            String give = names[0];
            String recive = names[1];
            
            // 2. 선물지수 계산해서 객체에 저장
            presentLog.put(give, presentLog.get(give) + 1);
            presentLog.put(recive, presentLog.get(recive) - 1);
            
            // 3. 주고받은 선물 저장
            // 선물을 준 사람의 value (여기선 Map 객체)에 저장한다.
            record.get(give).put(recive, 
                                 record.get(give).getOrDefault(recive, 0) + 1);
        }
        
        
        // 4. 주고받은 선물의 대한 현황을 찾는다.
        for(String friend : friends){
            for(String target : friends){
                if(friend.equals(target)){
                    continue;
                }
                
                // 5. 주고받은 선물의 갯수를 찾는다. 
                // - 더 많이 줬는지 확인
                // - 선물을 주고 받지 않았는지 확인
                // - 주고받지 않았더라면, 선물 지수가 큰지 확인
                if(record.get(friend).getOrDefault(target, 0) > 
                   record.get(target).getOrDefault(friend, 0) || 
                  record.get(friend).getOrDefault(target, 0).equals(
                      record.get(target).getOrDefault(friend, 0)) &&
                   presentLog.get(friend) > presentLog.get(target)) 
                {
                    presentStore.put(friend, presentStore.get(friend) + 1);
                }
            }
        }
             
        // 6. presentStore 객체의 최대값 (value) 을 찾는다
        return Collections.max(presentStore.values());
    }
}