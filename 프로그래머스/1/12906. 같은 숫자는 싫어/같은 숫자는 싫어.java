import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
      
        
        List<Integer> store = new ArrayList<>();
        
        store.add(arr[0]);
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] != arr[i]){
                store.add(arr[i]);
            }
        }

        int[] answer = new int[store.size()];
        
        for(int i = 0; i < store.size(); i++){
            answer[i] = store.get(i);
        }

        return answer;
    }
}