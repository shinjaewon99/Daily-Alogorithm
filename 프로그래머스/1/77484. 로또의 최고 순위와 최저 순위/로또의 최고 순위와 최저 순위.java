class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int totalCnt = 0;
        int maxCnt = 0;
        int minCnt = 0;
        int zeroCnt = 0;
        
        // 순서와 상관없이 로또 번호가 맞는지 확인
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    totalCnt++;
                }
            }
        }
        
        // 매직넘버인 0의 갯수를 구한다.
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zeroCnt++;
            }
        }
        
        maxCnt = totalCnt + zeroCnt;
        minCnt = totalCnt;
        
        answer[0] = getRank(maxCnt);
        answer[1] = getRank(minCnt);
        
        return answer;
    }
    
    private int getRank(int matchCount) {
        switch (matchCount) {
            case 6: return 1;
            case 5: return 2;
            case 4: return 3;
            case 3: return 4;
            case 2: return 5;
            default: return 6;
        }
    }
}