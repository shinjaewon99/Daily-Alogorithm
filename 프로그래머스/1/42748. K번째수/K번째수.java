import java.util.Arrays;

class Solution {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int a = commands[i][0]; // 2
			int b = commands[i][1]; // 5
			int c = commands[i][2]; // 3

            // array 라는 배열을 a - 1 인덱스 부터 b 인덱스 까지 복사
			int[] copyArray = Arrays.copyOfRange(array, a - 1, b);
			Arrays.sort(copyArray);

			answer[i] = copyArray[c - 1];
		}

		return answer;
	}
}