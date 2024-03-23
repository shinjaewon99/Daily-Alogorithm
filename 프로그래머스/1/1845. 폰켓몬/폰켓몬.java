import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] nums) {        
        // 1. N 마리의 포켓몬중 최소한의 조건인 N/2
        int getPoket = nums.length / 2;
        
        // 2. 중복을 제거하기 위한 Set 객체 선언
        Set<Integer> store = new HashSet<>();
        
        for(int num : nums){
            store.add(num);
        }
        
        if(getPoket > store.size()){
            return store.size();
        }
        
        return getPoket;
    }
}