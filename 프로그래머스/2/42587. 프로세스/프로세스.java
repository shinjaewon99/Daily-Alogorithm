import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 1. 우선순위큐를 내림차순 선언
        PriorityQueue<Integer> queue = 
            new PriorityQueue<>(Collections.reverseOrder());
        
        for(int number : priorities){
            queue.add(number);
        }
        
        // 2. 우선순위 큐가 비어질때 까지 반복
        while(!queue.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                // 3. 우선순위 큐에서 값을 꺼내어 배열과 같은 우선순위인지 확인
                if(queue.peek() == priorities[i]){
                    answer++;
                    queue.poll();
                     if(location == i){
                         return answer;
                    }
                }
            }
        }
        
        return answer;
    }
}