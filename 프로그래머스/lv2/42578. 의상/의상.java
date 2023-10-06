import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> store = new HashMap<>();
        
        // 1. clothes 배열의 길이 만큼 탐색
        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            
            store.put(type, store.getOrDefault(type, 0) + 1);
            
        }
        System.out.println(store);
         
        // 2. 한가지 타입에서 입는경우 안입는경우가 있기때문에 2가지 경우가 있다고 생각하고 계산 
        for(int number : store.values()){
            answer *= number + 1;
        }
        
        // 3. 아무것도 입지않은경우는 -1 해준다.
        return answer - 1;
    }
}