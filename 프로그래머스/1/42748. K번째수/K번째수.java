import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            
            List<Integer> store = new ArrayList<>();
            
            for(int j = a - 1; j < b; j++){
                store.add(array[j]);
            }
            
            Collections.sort(store);
            
            answer[i] = store.get(c - 1); 
        }
        
        return answer;
    }
}