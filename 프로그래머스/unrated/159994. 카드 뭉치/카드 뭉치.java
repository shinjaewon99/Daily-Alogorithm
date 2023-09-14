class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        int cards1Length = cards1.length;
        int cards2Length = cards2.length;
        int goalLength = goal.length;
        int cards1Index = 0;
        int cards2Index = 0;
        
        // 1. goal 배열 만큼 탐색
        for(int i = 0; i < goalLength; i++){
            String compare = goal[i];
        
            // 2. cards1 배열을 순차적으로 탐색
            if(cards1Length > cards1Index && compare.equals(cards1[cards1Index])){
                cards1Index++;
            }
            // 3. cards2 배열을 순차적으로 탐색
            else if(cards2Length > cards2Index && compare.equals(cards2[cards2Index])){
                cards2Index++;
            }
            // 4. goal 배열과 cards1, cards2 배열의 순서가 다르다면 "No" 반환
            else{
                return "No";
            }
        }
        
        return answer;
    }
}