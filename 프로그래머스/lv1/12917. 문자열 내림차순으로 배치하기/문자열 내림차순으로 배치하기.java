import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";

        // 1. 문자열 s를 문자열 배열로 변환
        String[] sSplit = s.split("");
        
        // 2. 문자열 배열을 오름차순 정렬
        Arrays.sort(sSplit);
        
        // 3. 오름차순 정렬된 문자열을 뒤에서 부터 꺼낸다.
        for(int i = sSplit.length - 1; i >= 0; i--){
            answer += sSplit[i];
        }
        
        return answer;
    }
}