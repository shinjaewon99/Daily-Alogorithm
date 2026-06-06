import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> store = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            store.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            
            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];
                
                if (store.containsKey(person)) {
                    sum += store.get(person);
                }
            }
            
            // 누적된 점수를 배열에 저장
            answer[i] = sum;
        }
        
        return answer;
    }
}