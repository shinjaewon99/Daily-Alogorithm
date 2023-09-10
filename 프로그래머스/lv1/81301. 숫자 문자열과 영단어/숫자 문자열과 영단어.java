class Solution {
    public int solution(String s) {
        
        // 1. 숫자 문자열을 영단어로 만든다.
        String[] numbers = {"zero", "one", "two", "three", "four", "five",
                                       "six", "seven", "eight", "nine"};
        
        // 2. 문자열 s에 있는 영어로된 숫자를 replace
        for(int i = 0; i < 10; i++){
            s = s.replaceAll(numbers[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}