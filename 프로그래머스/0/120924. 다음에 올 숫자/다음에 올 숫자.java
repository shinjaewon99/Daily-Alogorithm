class Solution {
    public int solution(int[] common) {
        // 같다는 것은 등차수열, 기본값은 등비수열로 세팅
        int answer = common[common.length - 1] + (common[1] - common[0]);
        
        // 다르다는 것은 등비수열
        if(common[1] - common[0] != common[2] - common[1]){
         
            answer = common[common.length - 1] * (common[1] / common[0]);
        }

        return answer;
    }
}