class Solution {
    private int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, 0, 0, target);
        
        return answer;
    }
    
    private void dfs(int[] numbers, int depth, int sum, int target){
        
        // 1. numbers 배열의 길이만큼 탐색하면 연산이 끝남
        if(numbers.length == depth){
            if(sum == target){
                answer++;
            }
        }else{
            // 2. 덧셈 재귀함수
            dfs(numbers, depth + 1, sum + numbers[depth], target);
            
            // 3. 뺄셈 재귀함수
            dfs(numbers, depth + 1, sum - numbers[depth], target);
        }
    }
}