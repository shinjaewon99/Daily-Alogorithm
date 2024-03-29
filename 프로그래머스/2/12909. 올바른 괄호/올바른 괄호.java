import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> store = new Stack<>();
        
        for(char word : s.toCharArray()){
            if(word != ')'){
                store.push(word);
            }else {
                // 1. 스택이 비어있지 않다면 짝이 맞지 않다는 것
                if(store.isEmpty()){
                    return false;
                }else {
                    store.pop();
                }
            }
        }
        
        // 2. 스택에 원소가 남아있는 경우
        if(store.size() != 0){
            return false; 
        }

        return answer;
    }
}