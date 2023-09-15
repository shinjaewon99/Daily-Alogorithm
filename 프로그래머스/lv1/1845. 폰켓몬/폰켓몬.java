import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> store = new HashMap<>();
    
        int select = nums.length / 2;
        int numsLength = nums.length;
        
        
        // 1. store 라는 Map 객체에 key, value 값을 담는다.
        for(int i = 0; i < numsLength; i++){
            store.put(nums[i], store.getOrDefault(store.get(i), 0) + 1);
        }
        
        int storeSize = store.size();
        // 2. store 객체의 길이가 nums 배열의 절반 길이가 작을경우 nums 배열의 길이 절반을 반환
        if(select < storeSize){
            return select;
        }
        
        
        return store.size();
    }
}