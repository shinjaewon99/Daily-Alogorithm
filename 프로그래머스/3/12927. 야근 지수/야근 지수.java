import java.util.PriorityQueue;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        // 우선순위 큐는 일반적으로 오름차순이므로, 내림차순으로 해준다.
        PriorityQueue<Integer> store = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work : works){
            store.add(work);
        }
        
        // 퇴근 까지 남은시간 동안 반복
        while(n > 0){
            int working = store.poll();
            if(working == 0) break;
            working--;
            store.add(working);
            n--;
        }
        
        for(int work : store){
            answer += work * work;
        }
        
        
        return answer;
    }
}