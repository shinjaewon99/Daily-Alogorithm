import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++){
            // 1. ~번째 부터 ~까지 자르는 수
            int first = commands[i][0];
            int second = commands[i][1];
            
            // 2. 몇번째 숫자를 추출할지
            int third = commands[i][2];
            
            int[] store = new int[second - first + 1];
            
            // 3. store 배열에 값 할당
            for(int j = first; j <= second; j++){     
                store[j - first] = array[j - 1];
            }
            Arrays.sort(store);
            
            answer[i] = store[third - 1];
        }
        return answer;
    }
}