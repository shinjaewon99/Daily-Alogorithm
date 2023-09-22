import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        // 1. 공백을 기준으로 split
        String[] sNumbers = s.split(" ");
        int[] numbers = new int[sNumbers.length];
        
        // 2. int 배열에 숫자 저장
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(sNumbers[i]);
        }
        
        // 3. int 배열 오름차순으로 정렬
        Arrays.sort(numbers);
        
        // 4. 최소값 최대값 저장
        answer.append(numbers[0]);
        answer.append(" ");
        answer.append(numbers[sNumbers.length - 1]);
        
        return answer.toString();
    }
}