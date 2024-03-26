import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        String[] answer = new String[numbers.length];
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            answer[i] = String.valueOf(numbers[i]);
        }
        
        // 1. 문자열의 크기를 비교
        Arrays.sort(answer, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        // EX : [0,1,2,4]의 입력값은 [4,2,1,0] 으로 정렬됨
        // 2. 0번 인덱스가 0이면 0으로 이루어진 배열이다.
        if(answer[0].equals("0")){
           return "0"; 
        }
        for(String word : answer){
            result.append(word);
        }
        return result.toString();
    }
}