import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public  int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> store = new HashMap<>();
        
        // 귤의 종류와 크기를 담는 Map 객체
        for(int tan : tangerine) {
            store.put(tan, store.getOrDefault(tan, 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>(store.values());
        int sum = 0;
        int count = 0;
 
        Collections.sort(result, Collections.reverseOrder());
        
        // 귤의 갯수와 서로 최소종류 일때
        for(int i = 0; i < result.size(); i++) {
            sum += result.get(i);
            count++;
            
            if(sum >= k) {
                break;
            }
        }
        
        
        return count;
    }
}