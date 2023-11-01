class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {
        
        // 1. dfs 메소드 호출
        dfs(numbers, 0, 0 , target);
        return answer;
    }
    
    private void dfs(int[] numbers, int depth, int sum, int target){   
        // 2. 배열 numbers를 끝까지 탐색했을경우
        if(depth == numbers.length){
             // 3. 타겟 넘버와 같을경우
            if(target == sum){
                answer++;
            }
        }else{
            dfs(numbers, depth + 1, sum + numbers[depth], target);
            dfs(numbers, depth + 1, sum - numbers[depth], target);
        }      
    }
}