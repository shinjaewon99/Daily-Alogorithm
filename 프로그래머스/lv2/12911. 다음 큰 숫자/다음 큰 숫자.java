class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. Integer.bitCount(int num) : num 변수를 2진수로 변환후 1의 갯수를 반환
        int num = Integer.bitCount(n);
    
        while(true){
            n++;
            
            // 2. 증가한 변수 n을 compare 변수에 담아준다.
            int compare = Integer.bitCount(n);
            
            // 조건 2
            // 3. compare 변수와 num 변수의 1의 갯수가 같을 경우 break;
            if(compare == num) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}