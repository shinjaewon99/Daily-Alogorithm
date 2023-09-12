class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        // 1. 왼쪽, 오른쪽에 문자를 담을 StringBuilder 선언
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        
        for(int i = 1; i < food.length; i++){
            // 2. food[] 인덱스별 절반 값만 음식을 양쪽에 배치하면 된다.
            for(int j = 0; j < food[i] / 2; j++){
                left.append(i);
                right.append(i);
            }
        }
        // 3. 중간 물을 배치 해준다
        left.append(0);
        answer = left.toString() + right.reverse().toString();
        
        return answer;
    }
}