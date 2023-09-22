import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        // 1. 오름차순으로 배열을 일단 정렬해준다.
        Arrays.sort(A);
        Arrays.sort(B);
        
        // 2. B 배열은 끝에서 부터 탐색하기 위해 index 변수 선언
        int index = B.length - 1;
        
        // 3. 최소값을 만들기 위해 A 배열에서는 작은값이 B 배열의 큰 값과 곱해야 한다.
        for(int i = 0; i < A.length; i++){
            answer += A[i] * B[index];
            index--;
        }

        return answer;
    }
}