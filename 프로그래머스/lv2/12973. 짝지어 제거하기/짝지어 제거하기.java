import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> store = new Stack<>();
        int answer = 0;
        
        
        for(int i = 0; i < s.length(); i++){
            char alphabet = s.charAt(i);
            
            // 1. 초기 Stack 객체가 비어 있을경우 문자 push
            if(store.isEmpty()){
                store.push(alphabet);
            }
            // 2. Stack 객체의 맨 위의 문자가 alphabet 변수랑 같을경우 pop
            else if(store.peek() == alphabet){
                store.pop();
            }
            // 3. 다를경우 Stack 객체에 push
            else{
                store.push(alphabet);
            }
            
        }

        if(store.size() == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }
}