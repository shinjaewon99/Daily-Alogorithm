
import java.util.Arrays;
import java.util.Queue;
import java.util.PriorityQueue;
class Solution {
	public int solution(int[] scoville, int K) {

		Queue<Integer> store = new PriorityQueue<>();
        
        // 1. 우선순위 큐에 모든 원소 추가
		Arrays.stream(scoville).forEach(store::add);

		int answer = 0;
   
		while(store.peek() < K){
			if(store.size() == 1){
				return -1;
			}
            
            // 2. 음식을 섞기위해 원소 추출
			int first = store.poll();
			int second = store.poll();

			store.add(first + (second * 2));
			answer++;
		}

        return answer;
	}
}