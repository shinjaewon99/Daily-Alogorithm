import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> store = new HashMap<>();
        
        // Map 객체에 name, yearning 담기
        for(int i = 0; i < name.length; i++) {
            store.put(name[i], store.getOrDefault(name[i], yearning[i]));
        }
        
        // 각 사진의 추억점수 더하기
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++){
                if(store.containsKey(photo[i][j])) {
                    answer[i] += store.get(photo[i][j]);
                }
            }
        }
        
        return answer;
    }
}