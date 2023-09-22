class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] stores = s.split(" ");
    
        for(int i = 0; i < stores.length; i++){
            stores[i] = stores[i].toLowerCase();
        }
        
        for(int i = 0; i < stores.length; i++){
            String store = stores[i];
            // 2. 글자가 공백일 경우
            if(store.length() == 0){
                answer.append(" ");
                continue;
            }
            
            // 3. 첫 글자를 대문자로 만들어준다.
            answer.append(store.substring(0, 1).toUpperCase());
            
            // 4. 첫 글자를 제외한 나머지 글자는 그대로 저장 (이미 처음에 소문자로 변환)
            answer.append(store.substring(1, store.length()));
            
            // 5. split한 문장이 끝나면 공백 저장
            answer.append(" ");
            
        }
        
        // 6. 기존의 s 문자열의 끝 문자가 공백이 아닐경우 문장 끝의 공백 제거
        if(!(s.substring(s.length() - 1, s.length()).equals(" "))){
            answer.deleteCharAt(answer.lastIndexOf(" "));
        }
        
        
        return answer.toString();
    }
}