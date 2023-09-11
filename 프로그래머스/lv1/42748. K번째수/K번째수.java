import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        // 1. 2차원 commands 배열 탐색 
        for(int i = 0; i < commands.length; i++){
            
            // 2. 시작 인덱스, 마지막 인덱스, 찾는 인덱스 변수 선언
            int start = commands[i][0];
            int end = commands[i][1];
            int find = commands[i][2];
            
        // 3. reArray 배열에 인덱스로 잘라서 복사, (복사 당할 인덱스, 시작 인덱스, 끝 인덱스)
        // 끝 인덱스는 -1 안해도 된다.
            int[] reArray = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(reArray);
            answer[i] = reArray[find - 1];
        }
        
        return answer;
    }
}