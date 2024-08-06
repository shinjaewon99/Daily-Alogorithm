import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        /**
        * 우선순위 큐를 사용해 최대, 최소를 빠르게 얻음
        *   [4, 3, 3]의 경우 야근 피로도는 4^2 + 3^2 + 3^2 = 34
            [3, 2, 2]의 경우 야근 피로도는 3^2 + 2^2 + 2^2 = 17
            [2, 2, 2]의 경우 야근 피로도는 2^2 + 2^2 + 2^2 = 12
        **/
        PriorityQueue<Integer> store = new PriorityQueue<>(Collections.reverseOrder());

        for(int work : works) {
            store.add(work);
        }
        
        for(int i = 0; i < n; i++) {
            int number = store.poll();
            
            if(number == 0) return 0;
            
            store.add(number - 1);
        }
        
        while(!store.isEmpty()){
            answer += Math.pow(store.poll(), 2);
        }
        
        /**
        for문으로 하게 되면, store 객체의 size가 poll() 메소드로 인해 가변적으로 변해서
        결과값이 달라짐
        
        for(int i = 0; i < store.size(); i++) {
             answer += Math.pow(store.poll(), 2);
        }
        **/
        
        return answer;
    }
}

