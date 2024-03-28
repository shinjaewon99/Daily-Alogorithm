import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> store = new HashMap<>();
        
        // 1. 의상의 종류를 Map 객체에 담아줌
        for(int i = 0; i < clothes.length; i++){
            String type = clothes[i][1];
            
            store.put(type, store.getOrDefault(type, 1) + 1);
        }
        
        // 2. 의상의 종류 별끼리 곱하는 만큼 조합이 생김
        for(String find : store.keySet()){
            answer *= store.get(find);
        }
        
        // 3. 아무것도 안입은 경우를 뺀다.
        return answer - 1;
    }
}