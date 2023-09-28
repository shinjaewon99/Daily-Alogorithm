class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long[] store = new long[2001];
        
        // 1. n이 1일경우, 2일경우 배열 값 할당
        store[1] = 1;
        store[2] = 2;
        
        
        // 2. dp풀이 방식으로 접근
        for(int i = 3; i <= n; i++){
            store[i] = (store[i - 2] + store[i - 1]) % 1234567;
        }
        
        return store[n];
    }
}