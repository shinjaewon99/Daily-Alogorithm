/*
문제
세준이는 피시방에서 아르바이트를 한다. 세준이의 피시방에는 1번부터 100번까지 컴퓨터가 있다.

들어오는 손님은 모두 자기가 앉고 싶은 자리에만 앉고싶어한다. 따라서 들어오면서 번호를 말한다. 만약에 그 자리에 사람이 없으면 그 손님은 그 자리에 앉아서 컴퓨터를 할 수 있고, 사람이 있다면 거절당한다.

거절당하는 사람의 수를 출력하는 프로그램을 작성하시오. 자리는 맨 처음에 모두 비어있고, 어떤 사람이 자리에 앉으면 자리를 비우는 일은 없다.

입력
첫째 줄에 손님의 수 N이 주어진다. N은 100보다 작거나 같다. 둘째 줄에 손님이 들어오는 순서대로 각 손님이 앉고 싶어하는 자리가 입력으로 주어진다.

출력
첫째 줄에 거절당하는 사람의 수를 출력한다.

예제 입력 1
3
1 2 3
예제 출력 1
0
*/
import java.util.Scanner;

public class problem262 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        boolean[] flag = new boolean[101]; // 배열 크기 할당
        int count = 0;

        for (int i = 1; i <= input; i++) {
            int n = in.nextInt();
            if (flag[n]) count++;
            else flag[n] = true; // 앉았으면 true
        }
        System.out.print(count);
    }
}

