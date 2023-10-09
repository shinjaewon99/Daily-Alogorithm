import java.util.Queue;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        // 1. 우선순위 큐 선언, 최소 값 추출
        Queue<Integer> queue = new PriorityQueue<>();

        for(int i : scoville){
            queue.add(i);
        }
        
        while(queue.peek() < K){
            
            // 2. 스코빌 지수를 K이상으로 만들수 없는 경우는 남아있는 수가 1개일경우
            if(queue.size() == 1){
                return -1;
            }
            
            queue.add(queue.poll() + (queue.poll() * 2));
            answer++;
        }
        
      
        return answer;
    }
}