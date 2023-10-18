import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Map<Integer, Integer> store1 = new HashMap<>(); // 형
        Map<Integer, Integer> store2 = new HashMap<>(); // 동생
        
        // 1. 동생 Map 객체에 토핑의 번호의 갯수를 저장한다.
        for(int number : topping){
            store2.put(number, store2.getOrDefault(number, 0) + 1);
        }
        
        for(int number : topping){
            // 2. 토핑을 하나씩 저장 한다.
            store1.put(number, store1.getOrDefault(number, 0) + 1);
            
            // 3. 자르는 기준
            if(store2.get(number) - 1 == 0){
                store2.remove(number);
            }else{
                store2.put(number, store2.get(number) - 1);
            }
            
            if(store1.size() == store2.size()){
                answer++;
            }
        }
        
        return answer;
    }
}