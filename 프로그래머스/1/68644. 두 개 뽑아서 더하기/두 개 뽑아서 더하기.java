import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] numbers) {
        
        
        Arrays.sort(numbers);
        Set<Integer> store = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                
                store.add(sum);
            }
        }
        
        // Set 객체를 int 배열로 변환
        int[] answer = new int[store.size()];
        int index = 0;
        for (int num : store) {
            answer[index++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}