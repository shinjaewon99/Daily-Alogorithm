import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(n > 0){
            // 1. 자릿수 구하기
            answer += n % 10;
            
            // 2. 자연수 n 재할당
            n /= 10;
        }

        return answer;
    }
}