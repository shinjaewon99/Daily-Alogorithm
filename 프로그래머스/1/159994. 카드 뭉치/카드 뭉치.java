class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Length = 0;
        int cards2Length = 0;
        
        for(int i = 0; i < goal.length; i++){
            
            // 비교할 문자열
            String target = goal[i];
            
            // 카드를 한칸씩 앞으로 땡기면서 비교
            if(cards1Length < cards1.length && target.equals(cards1[cards1Length])){
                cards1Length++;
            }else if(cards2Length < cards2.length && target.equals(cards2[cards2Length])){
                cards2Length++;
            }else {
                answer = "No";
            }
        }
        
        return answer;
    }
}