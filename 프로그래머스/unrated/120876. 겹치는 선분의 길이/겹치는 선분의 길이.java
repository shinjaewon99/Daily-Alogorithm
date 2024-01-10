import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> store = new HashMap<>();

        // 1. store 객체 초기화
        for(int i = -100; i <= 100; i++){
            store.put(i, 0);
        }
        
        for(int i = 0; i < lines.length; i++){
            // 2. 시작 선분부터 끝 선분까지 반복
            for(int j = lines[i][0]; j < lines[i][1]; j++){
                store.put(j, store.get(j) + 1);
            }
        }

        // 3. store 객체의 value 값이 2인 경우는 겹치는 선분이 있다는것
        for(int findNumber : store.values()){
            if(findNumber >= 2){
                answer++;
            }
        }
        return answer;
    }
}