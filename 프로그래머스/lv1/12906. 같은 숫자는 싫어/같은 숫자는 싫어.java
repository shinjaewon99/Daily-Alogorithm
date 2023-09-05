import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            // 1. 스택이 비어있을경우 add
            if(stack.isEmpty()){
                stack.add(i);
            }
            // 2. 스택의 맨위의 값이 배열의 값과 다를경우
            else if(stack.peek() != i){
                stack.add(i);
            }
        }
        
        // 4 3 
        int[] answer = new int[stack.size()];
        
        // 3. 유의 스택을 pop 할경우 스택의 size() 가 점차 줄어든다.
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = stack.pop();
        }
        
        return answer;
    }
}