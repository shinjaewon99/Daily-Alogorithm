import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        int sLength = s.length();
        
        for(int i = 0; i < sLength; i++){
            // 1. Stack 객체 문자열 s의 길이만큼 생성
            Stack<Character> store = new Stack<>();
            
            for(char ch : s.toCharArray()){
                // 2. Stack 객체가 비어있는경우
                if(store.isEmpty()){
                    store.push(ch);
                }
                // 3. Stack 객체와 ch 문자를 비교하여 Stack 객체를 pop
                else if(ch == ']' && store.peek() == '['){
                    store.pop();
                }else if(ch == ')' && store.peek() == '('){
                    store.pop();
                }else if(ch == '}' && store.peek() == '{'){
                    store.pop();
                }else{
                    store.push(ch);
                }
            }
            // 4. Stack 객체가 비어있다는것은 올바른 괄호 이다.
            if(store.isEmpty()){
                answer++;
            }
            
            // 5. s 문자열 회전하여 재 할당
            s = s.substring(1) + s.charAt(0);
        }
        return answer;
    }
}