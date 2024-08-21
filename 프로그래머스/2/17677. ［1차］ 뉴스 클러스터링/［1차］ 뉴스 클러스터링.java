import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

class Solution {
    public double solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        
        List<String> store1 = new ArrayList<>();
        List<String> store2 = new ArrayList<>();
        
        List<String> count1 = new ArrayList<>();
        List<String> count2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++){
            char word1 = str1.charAt(i);
            char word2 = str1.charAt(i + 1);
            
            // 자른 문자가 영문자인 경우만 담는다.
            if(Character.isLetter(word1) && Character.isLetter(word2)) {
                store1.add(Character.toString(word1) + Character.toString(word2));
            }
        }
        
        for(int i = 0; i < str2.length() - 1; i++){
            char word1 = str2.charAt(i);
            char word2 = str2.charAt(i + 1);
            
            // 자른 문자가 영문자인 경우만 담는다.
            if(Character.isLetter(word1) && Character.isLetter(word2)) {
                store2.add(Character.toString(word1) + Character.toString(word2));
            }
        }
        
        // 배열 순서를 맞추기 위한 정렬
        Collections.sort(store1);
        Collections.sort(store2);
    
        // 교집합 구하기
        for(String word : store1){
            if(store2.remove(word)){
                count1.add(word);
            }
            count2.add(word);
        }

        // 합집합 구하기
        for(String word : store2) {
            count2.add(word);
        }
        
        double result1 = count1.size();
        double result2 = count2.size();
        
        double zakad = 0;
        
        // 합집합이 없으면 공집합이다.
        if(result2 == 0){
            zakad = 1;
        }else {
            zakad = result1 / result2 ;
        }
       
        // int형으로 타입캐스팅
        return (int) (zakad * 65536);
    }
}