import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String msg) {
        int length = msg.length();
        
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> store = new HashMap<>();
        int index = 1;
        
        // 사전 초기화
        for(char i = 'A'; i <= 'Z'; i++){
            store.put(String.valueOf(i), index++);
        }
        
        int i = 0;
        while(i < length){
            String comp = "" + msg.charAt(i);
            
            // 다음 글자 찾기
            int j = i + 1;
            while (j <= length && store.containsKey(msg.substring(i, j))) {
                comp = msg.substring(i, j);
                j++;
            }
            
            result.add(store.get(comp));
            
            // 사전추가
            if(j <= length){
                String newComp = msg.substring(i, j);
                store.put(newComp, index++);
            }
            
            // 포인터 이동
            i += comp.length();
        }
        
        int[] answer = new int[result.size()];
        
        for(int z = 0; z < result.size(); z++){
            answer[z] = result.get(z);
        }
        
        return answer;
    }
}