import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> assistance = new Stack<>();
        int answer = 0;
        int index = 0;
        
        for(int i = 1; i <= order.length; i++){
            assistance.push(i);
            
            // 보조 컨테이너와 순서가 같은지 확인
            while(!assistance.isEmpty() && assistance.peek() == order[index]){
                assistance.pop();
                answer++;
                index++;
            }
        }
        
        return answer;
    }
}