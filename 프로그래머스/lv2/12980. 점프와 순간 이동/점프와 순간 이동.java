public class Solution {
    public int solution(int n) {
        int ans = 0;
  
        // 1. 건전지를 사용하여 점프 변수
        int battery = 1;
        while(n != 0){
            // 2. 장소가 짝수인 경우
            if(n % 2 == 0){
                n /= 2;
            }
            // 3. 짝수가 아닌경우 점프를 한번 한다.
            else{
                ans++;
                n -= battery;
            }
        }
        
        return ans;
    }
}