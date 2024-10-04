class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String number = Integer.toString(n, k);
        String[] numbers = number.split("0");
        
        for(int i = 0; i < numbers.length; i++){
            if(!numbers[i].isEmpty() && isCheck(numbers[i])){
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isCheck(final String number){
        Long convertNumber = Long.parseLong(number);
        
        // 2보다 작은 숫자는 소수가 아님 ex : 1
        if(convertNumber < 2){
            return false;
        }
        
        for(int i = 2; i <= Math.sqrt(convertNumber); i++){
            if(convertNumber % i == 0){
                return false;
            }
        }
        return true;
    }
}