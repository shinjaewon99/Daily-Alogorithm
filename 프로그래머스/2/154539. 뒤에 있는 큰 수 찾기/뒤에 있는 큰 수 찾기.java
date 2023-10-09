import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();
        
        // 1. 첫번째 index에 접근하기 위해 스택에 값을 채웁니다.
        stack.push(0);
        for(int i = 1; i < numbers.length; i++){
            
            // 2. 스택이 비어있지않고, 앞의 값보다 그 뒤의 값이 큰 경우 검증
            // 스택이 비어있는 조건을 넣는 이유는 [2, 3, 3, 5]의 입력값시, 3 3 에 두번 pop() 메소드가 호출되게됨으로 예외 발생
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
              
            }
            stack.push(i);
        }
        
        // 3. 스택이 비어질때 까지 반복
        // -1로 채운다.
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }
        
        return answer;
    }
}