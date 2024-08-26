import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
    
        for(int i = 0; i <= 9; i++){
            
            boolean find = false;
            
            for(int number : numbers){
                
                // 숫자중 일부가 없는지 확인
                if(i == number){
                    find = true;
                    break;
                }
            }
            
            if(!find){
                answer += i;
            }
        }
        
        return answer;
    }
}