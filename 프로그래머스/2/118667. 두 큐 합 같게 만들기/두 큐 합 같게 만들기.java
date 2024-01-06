import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> store1 = new LinkedList<>();
        Queue<Integer> store2 = new LinkedList<>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        int max = 0;
        
        // 1. 각 배열의 총 합을 구한다.
        for(int i = 0; i < queue1.length; i++){
            sum1 += queue1[i];
            store1.add(queue1[i]);
            if(max < queue1[i]){
                max = queue1[i];
            }
        }
        
        for(int i = 0; i < queue2.length; i++){
            sum2 += queue2[i];
            store2.add(queue2[i]);
            if(max < queue2[i]){
                max = queue2[i];
            }
        }
        
        // 2. max값이 총 합보다 크면 -1 
        if(sum1 + sum2 - max < max){
            return - 1;
        }
        
        // 3. 두 큐의 합이 같을 수 있게 비교한다.
        int answer = 0;
        
        while(true){
            // 4. 배열의 모든 경우의수를 비교해도 결과값이 같지 않은 경우
            if(answer > queue1.length * 4){
                return -1;
            }
            
            // 5. sum1이 sum2보다 클 경우
            if(sum1 > sum2){
                int findNumber1 = store1.poll();
                store2.add(findNumber1);
                sum1 -= findNumber1;
                sum2 += findNumber1;
                
            }else if(sum2 > sum1){
                int findNumber2 = store2.poll();
                store1.add(findNumber2);
                sum1 += findNumber2;
                sum2 -= findNumber2;
            }else{
                break;
            }
            answer++;
        }
        return answer;
    }
}