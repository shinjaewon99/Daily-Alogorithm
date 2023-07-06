/*
문제
에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.

이 알고리즘은 다음과 같다.

2부터 N까지 모든 정수를 적는다.
아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(1, K) < N ≤ 1000)

출력
첫째 줄에 K번째 지워진 수를 출력한다.

예제 입력 1
7 3
예제 출력 1
6
예제 입력 2
15 12
예제 출력 2
7
예제 입력 3
10 7
예제 출력 3
9
2, 4, 6, 8, 10, 3, 9, 5, 7 순서대로 지워진다. 7번째 지워진 수는 9이다.
*/
import java.util.Scanner;

public class problem503 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        boolean[] flag = new boolean[number + 1];

        for (int i = 2; i <= number; i++) {
            for (int j = i; j <= number; j+= i) {

                // 이미 지워진 수 인지 확인
                if(!flag[j]){
                    count++;
                    flag[j] = true;
                }

                // k번째 지워진 수 출력
                if(count == k){
                    System.out.println(j);
                    // break를 하게되면 안쪽 for문만 탈출하게 됨으로 시스템을 완전히 탈출해야됩니다.
                    System.exit(0);
                }
            }
        }
    }
}

