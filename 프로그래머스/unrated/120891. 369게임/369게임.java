class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String number = String.valueOf(order);
        String[] numbers = number.split("");
        
        for(String findNumber : numbers){
            if(findNumber.equals("3") ||
               findNumber.equals("6") ||
               findNumber.equals("9")){
                answer++;
            }
        }
        
        
        return answer;
    }
}