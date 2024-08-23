import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> store = new HashMap<>();
        
        // Map 객체에 원하는 상품과 갯수를 담는다.
        for(int i = 0; i < number.length; i++){
            store.put(want[i], store.getOrDefault(want[i], 0) + number[i]);
        }
        
        // 할인 가능한 물건을 확인
        for(int i = 0; i < discount.length - 9; i++){
            Map<String, Integer> compare = new HashMap<>();
            
            // 10일을 기준으로 상품과 갯수가 일치하는지 확인
            for(int j = 0; j < 10; j++){
                compare.put(discount[i + j], compare.getOrDefault(discount[i + j], 0) + 1);
            }
            
            boolean check = true;
            
            // 원하는 상품의 key값을 꺼냄
            for(String word : store.keySet()){
                int compareCnt = compare.getOrDefault(word, 0);
                int storeCnt = store.get(word);
                
                // 원하는 상품의 갯수가, 할인 상품의 갯수보다 적음
                if(storeCnt > compareCnt){
                    check = false;
                    break;
                }
            }
            
            if (check){
                answer++;
            }
            
        }

        return answer;
    }
}