import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            // 1. n번째 인덱스 문자 추출 (문제에서 인덱스 n이라고 했으므로 charAt(n))
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            
            // 2. 추출한 문자가 같다면, 원래 문자열 전체를 사전순으로 비교
            if (c1 == c2) {
                return s1.compareTo(s2);
            }
            
            // 3. 문자가 다르다면, n번째 문자끼리 비교해서 오름차순 정렬
            return Character.compare(c1, c2);
        });
        
        return strings;
    }
}