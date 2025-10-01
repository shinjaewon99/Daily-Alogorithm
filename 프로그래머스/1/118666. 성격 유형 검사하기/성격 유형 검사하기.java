import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        int length = survey.length;
        Map<Character, Integer> store = new HashMap<>();
        
        // 초기화
        store.put('R', 0);
        store.put('T', 0);
        store.put('C', 0);
        store.put('F', 0);
        store.put('J', 0);
        store.put('M', 0);
        store.put('A', 0);
        store.put('N', 0);
        
        for(int i = 0; i < length; i++){
            char key1 = survey[i].charAt(0);
            char key2 = survey[i].charAt(1);
            
            if(choices[i] > 4) {
                store.put(key2, store.get(key2) + choices[i] - 4);
            }else if (choices[i] < 4){
                store.put(key1, store.get(key1) + (4 - choices[i]));
            }
        }
        
        String result = getResult(store);
        return result;
    }
    
    private String getResult(Map<Character, Integer> store) {
        StringBuilder output = new StringBuilder();
        
        if(store.get('R') >= store.get('T')){
            output.append('R');
        }else{
            output.append('T');
        }
        
        if(store.get('C') >= store.get('F')){
            output.append('C');
        }else{
            output.append('F');
        }
        
        if(store.get('J') >= store.get('M')){
            output.append('J');
        }else{
            output.append('M');
        }
        
        if(store.get('A') >= store.get('N')){
            output.append('A');
        }else{
            output.append('N');
        }
        
        return output.toString();
    }
}