/*
문제
N(1 ≤ N ≤ 100,000)개의 로프가 있다. 이 로프를 이용하여 이런 저런 물체를 들어올릴 수 있다. 각각의 로프는 그 굵기나 길이가 다르기 때문에 들 수 있는 물체의 중량이 서로 다를 수도 있다.

하지만 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다. k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.

각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구해내는 프로그램을 작성하시오. 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다.

입력
첫째 줄에 정수 N이 주어진다. 다음 N개의 줄에는 각 로프가 버틸 수 있는 최대 중량이 주어진다. 이 값은 10,000을 넘지 않는 자연수이다.

출력
첫째 줄에 답을 출력한다.

예제 입력 1
2
10
15
예제 출력 1
20
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem504 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        // 5 10 15 20
        /*
        1번째 로프(5)는 4개를 사용할 수 있으므로 들 수 있는 중량은 5 * 4 = 20입니다.
        2번째 로프(10)는 3개를 사용할 수 있으므로 들 수 있는 중량은 10 * 3 = 30입니다.
        3번째 로프(15)는 2개를 사용할 수 있으므로 들 수 있는 중량은 15 * 2 = 30입니다.
        4번째 로프(20)는 1개만 사용할 수 있으므로 들 수 있는 중량은 20입니다.
        */
        int result = 0;
        for (int i = 0; i < size; i++) {
            int temp = arr[i] * (size - i);
            result = Math.max(temp, result);
        }
        System.out.println(result);
    }
}

