import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> store = new HashMap<>();
        
        // 1. 필요 상품과 갯수 Map 객체에 저장
        for(int i = 0; i < number.length; i++){
            store.put(want[i], number[i]);
        }
        
        // 2. discount 배열의 길이에서 -10만큼 탐색
        for(int i = 0; i < discount.length - 10 + 1; i++){
            Map<String, Integer> compare = new HashMap<>();
            
            // 3. 10일까지 반복하여 저장
            for(int j = 0; j < 10; j++){
                compare.put(discount[i + j], compare.getOrDefault(discount[i + j], 0) + 1);
            }
            
            boolean flag = true;
            
            // 4. store와 compare의 value 값을 비교 합니다.
            for(String find : store.keySet()){
                int compareNum = compare.getOrDefault(find, 0);
                int storeNum = store.get(find);
                
                // 5. storeNum이 크다는것은 원하는 물건의 갯수가 부족하다는 것
                if(storeNum > compareNum){
                    flag = false;
                    break;
                }
                
            }
            // 6. 할인이 가능한 날 증가
            if(flag){
                answer++;
            }
        }
        return answer;
    }
}