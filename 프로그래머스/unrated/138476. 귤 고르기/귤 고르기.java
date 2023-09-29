import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int arrayLength= tangerine.length;
        Map<Integer, Integer> store = new HashMap<>();
        
        // 1. Map 객체에 배열의 값과 그 값에 해당하는 갯수 저장
        for(int i = 0; i < arrayLength; i++){
            store.put(tangerine[i], store.getOrDefault(tangerine[i], 0) + 1);
            
        }
        
        // 2. List 객체에 Map 객체 value값 저장
        List<Integer> list = new ArrayList<>(store.values());
        
        // 3. List 객체 오름차순 정렬
        Collections.sort(list);
        
        
        int sum = 0;
        
        // 4. List 객체를 내림차순으로 탐색
        for(int i = list.size() - 1; i >= 0; i--){
            sum += list.get(i);
            answer++;
            
            if(sum >= k){
                break;
            }
        }
        
        return answer;
    }
}