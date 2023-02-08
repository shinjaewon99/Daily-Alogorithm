/*문제
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
10
5
2
3
1
4
2
3
5
1
7
예제 출력 1
1
1
2
2
3
3
4
5
5
7
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class problem45 {
    public static void main(String[] args) throws IOException {
        // 처리속도를 줄이기 위해 BufferReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 또한 출력의 처리속도를 줄이기 위해 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        int size =Integer.parseInt(br.readLine());
        int [] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]).append("\n");
        }
        System.out.println(sb);
    }
}
