import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int index = 0;
        int[] reverseB = new int[B.length];
        // 1. A는 오름차순
        Arrays.sort(A);
        
        // 2. B는 내림차순
        Arrays.sort(B);
        for(int i = B.length - 1; i >= 0; i--){
            reverseB[index] = B[i];
            index++;
        }
        
        for(int i = 0; i < A.length; i++){
            answer += A[i] * reverseB[i];
        }
        
        return answer;
    }
}