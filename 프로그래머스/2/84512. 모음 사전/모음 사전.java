import java.util.List;
import java.util.ArrayList;

class Solution {
    private static final List<String> store = new ArrayList<>();
    private static final String[] dic = {"A", "E", "I", "O", "U"};
    
    public int solution(String word) {
        int answer = 0;
        dfs("", 0);
        
        // List 객체에 저장된 모음을 찾는다.
        for(int i = 0; i < store.size(); i++){
            if(store.get(i).equals(word)){
                answer = i;
            }
        }
        return answer;
    }
    
    private void dfs(String word, int depth) {
        store.add(word);
        
        if(depth == 5) return;
        
        // 모음사전 순서대로 마지막 단어 'UUUUU' 까지 다 담는다.
        for(int i = 0; i < 5; i++){
            dfs(word + dic[i], depth + 1);
        }
    }
}