class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        // 두개의 포인터 선언
        int start = 0;
        int end = 0;
        int length = sequence.length;
        int sum = sequence[0];
        int minLength = Integer.MAX_VALUE;
        
        // 배열의 끝까지 탐색
        while(start < length && end < length) {
            // 합이 k랑 같은 경우
            if(sum == k) {
                // 길이가 가장 짧은 인덱스를 구함
                if(end - start < minLength){
                    // end - start == 현재 인덱스
                    minLength = end - start;
                    
                    answer[0] = start;
                    answer[1] = end;
                }
                sum -= sequence[start];
                start++;
            }
            
            // 합이 k 보다 큰 경우
            else if(sum > k){
                sum -= sequence[start];
                start++;
            }
            
            // 합이 k 보다 작은 경우
            else {
                end++;
                if(end < length){
                    sum += sequence[end];  
                }
            }
        }
    
        return answer;
    }
}