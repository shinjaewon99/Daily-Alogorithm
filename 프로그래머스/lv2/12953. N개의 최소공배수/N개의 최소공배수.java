class Solution {
    public int solution(int[] arr) {

        // 1. 처음 두수의 최소공배수를 구해준다.
        int answer = lcm(arr[0], arr[1]);
 
        // 2. 배열 arr의 길이만큼 answer 변수에 재할당 해준다.
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }
    
    // 3. 최소 공배수 구하는 로직
    private int lcm (int a, int b){
        return a * b / gcd(a,b);
    }
    
    // 4. 최대 공약수 구하는 로직
    private int gcd(int a, int b){
        
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}