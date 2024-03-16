import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 1. keymap의 문자를 저장하기 위한 Map 객체 선언
        Map<Character, Integer> store = new HashMap<>();
        
        
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char word = keymap[i].charAt(j);
               
                // 2. Map 객체에 동잃한 key값이 있는지 확인
                if(store.containsKey(word)){
                    int index = store.get(word);
                    // 3. 최소 index 값을 저장 한다.
                    store.put(word, Math.min(j + 1, index));
                }else{
                    store.put(word, j + 1);
                }
            }
        }
        // {"A":1,"B":1,"C":2,"D":5,"E":3,"F":4}
        for(int j = 0; j < targets.length; j++){
            String target = targets[j];
            int count = 0;
            boolean check = true;
            // 4. Map 객체에 target 단어가 있는지 확인
            for(int i = 0; i < target.length(); i++){
                if(store.containsKey(target.charAt(i))){
                    count += store.get(target.charAt(i));
                }else{
                    check = false;
                    break;
                }
            }
            
            if(count == 0 || !check){
                answer[j] = -1;
            }else{
                answer[j] = count;
            }
        }
        
        return answer;
    }
}