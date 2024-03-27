import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Set<String> store = new HashSet<>();

        Arrays.stream(phone_book).forEach(store::add);

        // 1. 각각의 phone 문자열과 List 객체에 포함 되어 있는지 확인
        for (String book : phone_book) {
            for (int i = 0; i < book.length(); i++) {
                if(store.contains(book.substring(0, i))){
                    return false;
                }
            }
        }

        return answer;
    }
}