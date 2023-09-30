import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        int length = elements.length;
        
        // 1. 중복된 값을 제거 하기 위한 Set 객체 선언
        Set<Integer> storeSet = new HashSet<>();

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = 0; j < length; j++) {
                // 2. sum 변수의 배열을 탐색하여 누적합 할당
                sum += elements[(i + j) % length]; 
                storeSet.add(sum);
            }
        }

        return storeSet.size();
    }
}
