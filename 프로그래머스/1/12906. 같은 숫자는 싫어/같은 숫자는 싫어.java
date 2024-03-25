import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
		
		Stack<Integer> store = new Stack<>();

		Arrays.stream(arr)
				.filter(i -> store.isEmpty() || store.peek() != i)
				.forEach(store::push);
        
		int[] answer = new int[store.size()];
        
        // 1. stack은 FILO 이므로 뒤에서 부터 꺼내야된다.
		for (int i = store.size() - 1; i >= 0; i--) {
			answer[i] = store.pop();
		}
		return answer;
	}
}