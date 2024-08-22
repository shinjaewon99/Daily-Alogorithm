import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> store = new HashSet<>();
        
        for(String phone : phone_book) {
            store.add(phone);
        }
        
        for(String phone : phone_book) {
            
            // 각각의 phone 문자열을 잘라서 phone_book을 담았던 List 객체에 포함되어있는지 확인한다.
            for(int i = 0; i < phone.length(); i++) {
                if(store.contains(phone.substring(0, i))){
                    return false;
                }
            }
        }
        
        return true;
    }
}