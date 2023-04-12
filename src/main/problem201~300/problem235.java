/*
문제
코딩 프로젝트 수업을 가르치는 수찬이는 프로젝트 팀을 가능하면 공정하게 구성하려고 한다. 프로젝트 팀 하나는 두 명의 학생으로 구성되는데, 각 학생들의 코딩 역량은 모두 다르다. 각 학생은 한 팀의 팀원이어야 한다. 공정성을 높이기 위해 수찬이는 팀원 코딩 역량의 합을 최대한 일정하게 유지하려고 한다. 학생들이 코딩 역량이 주어졌을 때 수찬이가 팀을 구성하는데 도움이 되는 프로그램을 작성하라.

문제를 간단하게 하기 위해, 학생 수는 2n이라 가정하자 (n은 양의 정수). 각 학생 si의 코딩 역량은 양의 정수 w(si)로 나타내면 한 i번째 팀 Gi의 코딩 역량은 w(Gi) = ∑s∈Giw(s)로 나타낼 수 있다. 작성할 프로그램 목적은 Sm = min{w(Gi) | 1 ≤ i ≤ n}이 최대화되도록 n개의 팀 G1, G2, …, Gn 을 구성하고 이때 Sm을 출력하는 것이다.

예를 들어, 학생들의 코딩 역량이 {1, 7, 5, 8}로 주어졌다면 (8, 1), (7, 5)로 2개의 조를 짤 수 있으며 프로그램은 9를 출력해야 한다.

입력
입력은 표준입력을 사용한다. 입력의 첫 번째 행에는 팀 수를 나타내는 양의 정수 n(1 ≤ n ≤ 5,000)이 주어진다. 그 다음 행에 학생 si 의 코딩 역량 w(si)를 나타내는 2n개의 양의 정수가 공백으로 분리되어 주어진다 (1 ≤ w(si) ≤ 100,000). 학생들의 코딩 역량은 모두 다르다. 즉, i ≠ j이면 w(si) ≠ w(sj)이다.

출력
출력은 표준출력을 사용한다. 표준출력 한 행에 Sm을 출력한다.

예제 입력 1
2
1 7 5 8
예제 출력 1
9
예제 입력 2
3
1 7 3 5 9 2
예제 출력 2
8
*/

import java.util.Arrays;
import java.util.Scanner;

public class problem235 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int[] arr = new int[t * 2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            // 배열의 앞뒤로 더해준다.
            int sum = arr[j] + arr[t * 2 - 1 - j];
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min);
    }
}
