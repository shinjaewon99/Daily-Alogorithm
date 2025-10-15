import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Arrays;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        // B 팀원이 얻을수 있는 최대 승점
        PriorityQueue<Integer> storeA = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num : A){
            storeA.add(num);
        }
        
        Arrays.sort(B);
        Deque<Integer> storeB = new ArrayDeque<>();
        
        for(int num : B){
            storeB.add(num);
        }
        
        // 7 5 3 1
        // 2 2 6 8
        while(!storeA.isEmpty()){
            int compare = storeA.poll();
            
            if(compare < storeB.peekLast()){
                storeB.pollLast();
                answer++;
            }else{
                // 질때는 작은숫자
                storeB.pollFirst();
            }
        }
        
        return answer;
    }
}