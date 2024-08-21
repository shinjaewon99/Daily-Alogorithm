class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int divTotal = 0;
        
        for(int i = 0; i < num; i++) {
            divTotal += i;
        }
        
        int result = (total - divTotal) / num;
        
        for(int i = 0; i < num; i++) {
            answer[i] = result + i;
        }
        
        return answer;
    }
}