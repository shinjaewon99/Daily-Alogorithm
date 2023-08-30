class Solution {
    public int[] solution(long n) {
        // 1. 자연수 n의 길이 구하기
        String copy = String.valueOf(n);
        
        // 2. answer 배열 크기 초기화
        int[] answer = new int[copy.length()];
        
        // 3. n의 자릿수를 담을 배열 초기화
        long[] numbers = new long[copy.length()];
        
        // 4. numbres 배열에 n의 자릿수 담기
        int index = 0;
        while(n > 0){
            long init = n % 10;
            n /= 10;
            numbers[index] = init;
            index++;
        }
        
        // 5. answer 배열에 numbers 배열 옮겨 담기
        int resultIndex = 0;
        for(int i = 0; i < numbers.length; i++){
            answer[resultIndex] = (int) numbers[resultIndex];
            resultIndex++;
        } 
        return answer;
    }
}