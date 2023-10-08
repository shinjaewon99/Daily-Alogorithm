import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        // 1. 해시 맵을 사용하여 전화번호 저장
        Map<String, Boolean> map = new HashMap<>();
        for (String phone : phone_book) {
            map.put(phone, true);
        }

        // 2. 각 전화번호를 확인하면서 접두사인 경우가 있는지 검증
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                
                // 3. 접두사 문자열 추출
                String number = phone.substring(0, i);
                if (map.containsKey(number)) {
                    return false;
                }
            }
        }
        
        return answer;
    }
}
