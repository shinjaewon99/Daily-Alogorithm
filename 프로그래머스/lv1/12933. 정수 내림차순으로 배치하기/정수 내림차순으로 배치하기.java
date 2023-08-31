import java.util.Arrays;
class Solution {
    public long solution(long n) {
        
        // 1. 정수 n을 문자 배열로 변환
        String [] numbers = String.valueOf(n).split("");
            
        // 2. 오름차순 정렬
        Arrays.sort(numbers);
            
        // 3. StringBuilder 객체에 삽입후 reverse
        StringBuilder output = new StringBuilder();
            
        for(int i = 0; i < numbers.length; i++){
            output.append(numbers[i]);
        }

        return Long.parseLong(output.reverse().toString());
    }
}