/*
문제
민식이는 “오민식”이라는 팀이름으로 수없이 많은 로봇대회를 우승했다. 따라서 민식이의 집에는 트로피가 많다. 민식이는 트로피를 어떤 선반 위에 올려놨다. 이 선반은 민식이의 방문을 열고 들어가자마자 선반의 왼쪽이 보인다. 다른말로 하자면, 뒤의 트로피가 앞의 트로피에 가려져 있다는 말이다.

안타깝게도, 높이가 큰 트로피가 높이가 작은 트로피의 왼쪽에 있다면, 높이가 작은 트로피는 큰 트로피에 가려서 보이지 않게 된다. 트로피는 자기의 앞에 (보는 사람의 관점에서) 자기보다 높이가 작은 트로피가 있을 때만 보이게 된다. 민식이는 선반을 180도 회전시켜서 트로피가 보이는 개수를 변하게 할 수도 있다.

선반위에 올려져 있는 트로피의 높이가 주어졌을 때, 왼쪽에서 봤을 때 보이는 개수와, 오른쪽에서 봤을 때 보이는 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 트로피의 개수 N (1 ≤ N ≤ 50)이 주어진다. 둘째 줄부터 N개의 줄에 왼쪽의 트로피부터 차례대로 높이가 주어진다. 트로피의 높이는 100보다 작거나 같은 자연수이다.

출력
첫째 줄에 왼쪽에서 봤을 때 보이는 개수, 둘째 줄에 오른쪽에서 봤을 때 보이는 개수를 출력한다.

예제 입력 1
5
1
2
3
4
5
예제 출력 1
5
1
예제 입력 2
4
5
5
5
5
예제 출력 2
1
1
예제 입력 3
5
1
2
5
2
1
예제 출력 3
3
3
예제 입력 4
7
1
4
2
5
3
7
1
예제 출력 4
4
2
 */
import java.util.Scanner;

public class problem311 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 총 트로피 수
        int[] arr = new int[n];
        int flag = 0; // 높이 비교
        int left = 0; // 왼쪽에서 보이는 트로피 수
        int right = 0; // 오른쪽에서 보이는 트로피 수

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if (flag < arr[i]) {
                left++;
                flag = arr[i]; // 높이 갱신
            }
        }

        flag = 0; // 높이 초기화
        // 배열의 뒷쪽 부터 탐색
        for (int i = n - 1; i >= 0; i--) {
            if (flag < arr[i]) {
                right++;
                flag = arr[i];
            }
        }
        System.out.println(left);
        System.out.println(right);

    }
}
