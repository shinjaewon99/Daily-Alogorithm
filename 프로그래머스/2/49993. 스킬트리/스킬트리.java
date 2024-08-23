class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String word : skill_trees){
            String compareSkill = word;
            for(int i = 0; i < word.length(); i++){
                
                String compare = word.substring(i, i + 1);
                
                if(!(skill.contains(compare))){
                    compareSkill = compareSkill.replaceAll(compare, "");
                }
            }
            if(skill.indexOf(compareSkill) == 0) answer++;
        }
        
        return answer;
    }
}