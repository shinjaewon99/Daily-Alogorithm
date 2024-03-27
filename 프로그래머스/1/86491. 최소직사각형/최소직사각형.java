import java.util.Arrays;
class Solution {
	public int solution(int[][] sizes) {

		int maxWidth = Arrays
                        .stream(sizes)
                        .mapToInt(size -> Math.max(size[0], size[1]))
                        .max()
                        .orElse(0);
        
        // 1. mapToInt에 size[0], size[1]의 값의 최소값을 담는다.
        // 최소값만이 담긴 mapToInt 중 최대값을 찾음
		int maxHeight = Arrays
                        .stream(sizes)
                        .mapToInt(size -> Math.min(size[0], size[1]))
                        .max()
                        .orElse(0);
		
		return maxWidth * maxHeight;
	}
}