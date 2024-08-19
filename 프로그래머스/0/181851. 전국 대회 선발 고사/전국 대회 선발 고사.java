import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        int[] store = new int[rank.length];
        
        // true인 rank를 담고, true가 아닌 rank는 int 최대값으로 담는다.
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                store[i] = rank[i];
            }else {
               rank[i] = Integer.MAX_VALUE; 
            }
        }
        
        // 1 2 3 4 5 6
        Arrays.sort(rank);
       
         
        for(int i = 0; i < rank.length; i++){
            if(rank[0] == store[i]){
                answer += 10000 * i;
            }else if(rank[1] == store[i]){
                answer += 100 * i;
            }else if (rank[2] == store[i]){
                answer += i;
            }
        }
        
        return answer;
    }
}