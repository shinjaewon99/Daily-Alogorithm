class Solution {
    public int solution(String s) {
        
        String[] numbers = {"zero", "one", "two", "three", "four", "five",
                           "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++){
            s = s.replaceAll(numbers[i], String.valueOf(i));
        }
        

        return Integer.valueOf(s);
    }
}