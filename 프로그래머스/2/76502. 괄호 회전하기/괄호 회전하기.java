import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            Stack<Character> store = new Stack<>();
            
            // 각각의 괄호를 확인 한다.
            for(char word : s.toCharArray()){
                if(store.isEmpty()){
                    store.push(word);
                }else if(word == ')' && store.peek() == '('){
                    store.pop();
                }else if(word == ']' && store.peek() == '['){
                    store.pop();
                }else if(word == '}' && store.peek() == '{'){
                    store.pop();
                }else{
                    store.push(word);
                }
            }

            if(store.isEmpty()){
                answer++;
            }

            // 문자열을 회전시킨다.
            s = s.substring(1) + s.charAt(0);
        }
        
        
        return answer;
    }
}