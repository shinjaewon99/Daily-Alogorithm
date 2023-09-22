import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> store = new Stack<>();
     
        for(int i = 0; i < s.length(); i++){
            char input = s.charAt(i);
            
            // 1. 여는 괄호 일경우
            if(input == '('){
                store.push(input);
            }else{
                // 2. 스택이 비어있으면 닫는 괄호가 있을수 있음
                if(store.isEmpty()) return false;
                // 3. 스택이 비어있지 않다는것은 여는 괄호가 있음
                else store.pop();
            }
        }
        
        // 4. 여는괄호가 남아있을경우
        if(!store.isEmpty()) return false;

        return answer;
    }
}