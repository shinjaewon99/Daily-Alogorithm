import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List <Integer> numbers = new ArrayList<>();
        
        // 1. arr 배열에서 나누어 떨어지는 값 List 객체에 저장
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                numbers.add(arr[i]);
            }
        }
        
        // 2. 나누어 떨어지는 수가 없을 경우 = List 객체가 비어있음
        if(numbers.size() == 0){
            return new int[]{-1};
        }
        
        // 3. List 객체 answer 배열로 변환
        int[] answer = new int[numbers.size()];
        
        for(int i = 0; i < numbers.size(); i++){
            answer[i] = numbers.get(i);
        }
        
        // 4. answer 배열 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}