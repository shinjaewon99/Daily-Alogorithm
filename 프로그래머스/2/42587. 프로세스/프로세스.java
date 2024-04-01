import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 1. 우선순위가 높은 숫자부터 저장 (큰 숫자)
        Queue<Integer> store = new PriorityQueue<>(Collections.reverseOrder());
 
        for(int number : priorities){
            store.add(number);
        }
 
        int index = 0;
        
        // 2. 중요도 배열과 우선순위가 높은 큐와 비교
        while(!store.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(store.peek() == priorities[i]){
                    answer++;
                    store.poll();
                    if(location == i) return answer;
                }
            }
        }
        
        return answer;
    }
}