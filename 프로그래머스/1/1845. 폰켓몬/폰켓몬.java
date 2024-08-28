import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int chooseNum = nums.length / 2;
        
        Set<Integer> store = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++){
            store.add(nums[i]);
        }
        
        // 최대로 가져갈 수 있는 폰켓몬 수 계산
        if(chooseNum < store.size()){
            return chooseNum;
        }
        
        
        return store.size();
    }
}