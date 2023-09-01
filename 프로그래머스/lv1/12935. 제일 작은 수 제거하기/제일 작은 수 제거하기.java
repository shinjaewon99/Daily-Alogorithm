import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        List <Integer> numbers = new ArrayList<>();
     
        // 1. arr 배열의 길이가 1인 경우
        if(arr.length == 1){
            return new int[]{-1};
        }
        
        // 2. 최소값 탐색후 지정
        int min = arr[0];
        for(int i = 0 ; i < arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        
        // 3. numbers 객체에 최소값을 제외한 원소 담기
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }else{
                numbers.add(arr[i]);
            }
        }
        
        // 4. answer 배열 크기 지정
        int[] answer = new int[numbers.size()];
        
        // 5. numbers 객체 원소 answer 배열에 담기 
        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers.get(i);
        }
        
        return answer;
    }
}