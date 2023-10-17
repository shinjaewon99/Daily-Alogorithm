class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String skill_tree : skill_trees){
            // 1. 비교하기 위한 String 선언
            String store = "";
            
            // 2. 스킬 순서에 부합하는 스킬트리 저장
            for(char spell : skill_tree.toCharArray()){
                if(skill.contains(String.valueOf(spell))){
                    store += spell;
                }
            }
            
            // 3. 메소드 호출
            if(isCheck(store, skill)){
                answer++;
            }
        }
        
        return answer;
    }
    
    // 4. 스킬 순서와 스킬트리를 비교 하는 메소드
    private boolean isCheck(String store, String skill){
        for(int i = 0; i < store.length(); i++){
            if(skill.charAt(i) != store.charAt(i)){
                return false;
            }
        }
        return true;
    }
}