import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
    
        Map<Integer, Integer> totalTopping = new HashMap<>();
        
        
        for(int lol : topping){
            totalTopping.put(lol, totalTopping.getOrDefault(lol, 0) + 1);
        }
        
        
        Map<Integer, Integer> leftTopping = new HashMap<>();
        Map<Integer, Integer> rightTopping = new HashMap<>(totalTopping);
        
        for(int lol : topping){
            // 왼쪽에 토핑을 하나씩 담는다.
            leftTopping.put(lol, leftTopping.getOrDefault(lol, 0) + 1);
            
            // 오른쪽에 토핑을 하나씩 제거한다.
            rightTopping.put(lol, rightTopping.get(lol) - 1);
            
            if(rightTopping.get(lol) == 0){
                rightTopping.remove(lol);
            }
            
            if(leftTopping.size() == rightTopping.size()){
                answer++;
            }
        }
        
        
        return answer;
    }
}