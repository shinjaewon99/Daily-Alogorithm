class Solution {
    public int solution(int n, int k) {
        
        // 먹은 양꼬치 + 10인분을 기준으로 음료수 가격
        int answer = (n * 12000) + ((k - (n/10)) * 2000);
		return answer;
    }
}