class Solution {
    public int[] solution(int n, int m) {
        // 1. answer 배열 크기 지정
        int[] answer = new int[2];
        
        // 2. 최대 공약수 구하기
        answer[0] = gcd(n,m);
        
        // 3. 최소 공배수 구하기
        answer[1] = lcm(n,m);
        
        return answer;
    }
    
    private int lcm(int num1, int num2){
        return num1 * num2 / gcd(num1, num2);
    }
    
    private int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        return gcd(num2, num1 % num2);
    }
}