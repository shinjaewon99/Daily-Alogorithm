import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 1;
        
        Stack<Character> store = new Stack<>();
        
        for(char word : s.toCharArray()){
            // Stack 객체가 사이즈가 0일때는 담아준다.
            if(store.size() == 0){
                store.push(word);
            }
            // Stack에 담은 단어를 꺼내서, 다음 단어와 확인한다.
            else if(store.peek().equals(word)){
                store.pop();
            }else {
                store.push(word);
            }
        }

        if(store.size() != 0){
            answer = 0;
        }
        
        return answer;
    }
}