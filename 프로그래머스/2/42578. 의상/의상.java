import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> store = new HashMap<>();
        
        // 의상 종류별로 갯수 계산
        for (String[] clothe : clothes) {
            store.put(clothe[1], store.getOrDefault(clothe[1], 1) + 1);
        }

        for (int count : store.values()) {
            answer *= count;
        }
        
        // 아무것도 입지 않는 경우 제외
        return answer - 1;
    }
}
