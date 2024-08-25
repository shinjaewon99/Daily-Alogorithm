import java.util.stream.IntStream;

class Solution {
    public int solution(int[] a, int[] b) {

        /**for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }**/
        
        return IntStream.range(0, a.length)
                        .map(i -> a[i] * b[i])
                        .sum();
    }
}