class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Lenght = 0;
        int cards2Length = 0;
        
        for(int i = 0; i < goal.length; i++) {
            String target = goal[i];
            
            // cards1.length의 크기와 비교하는 이유, 인덱스를 초과하게되면 접근하는것 자체로도 예외 발생
            if(cards1Lenght < cards1.length && target.equals(cards1[cards1Lenght])){
                cards1Lenght++;
            }else if(cards2Length < cards2.length && target.equals(cards2[cards2Length])) {
                cards2Length++;
            }else{
                return "No";
            }
            
        }
        
        return answer;
    }
}