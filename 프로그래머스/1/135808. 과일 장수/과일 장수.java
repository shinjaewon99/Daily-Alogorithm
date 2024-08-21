import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 배열을 내림차순 하기 위한 Integer 배열  
        Integer[] store = new Integer[score.length];
        
        for (int i = 0; i < score.length; i++) {
            store[i] = score[i];
        }
        
         // 3 3 2 2 1 1 1
        Arrays.sort(store, Collections.reverseOrder());

        int index = 0;
        while(true){
            if(index + m > score.length) break;
            
            // 최소점수 = 상자의 마지막 인덱스
            answer += store[index + m - 1] * m;
            
            index += m;
        }
       
        
       
        return answer;
    }
}
