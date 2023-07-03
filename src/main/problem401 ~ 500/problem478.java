/*
문제
미래를 예측하는 능력이 있는 정균이는 앞으로
$N$일간 ANA 회사의 주가가 어떻게 변하는지 정확히 예측할 수 있다. 정균이는 예측한 결과를 바탕으로 ANA 회사의 주식 한 주를 적당한 시점에 사고 적당한 시점에 팔아서 최대한의 이득을 얻으려고 한다.

ANA 회사의 앞으로
$N$일간의 주가를
$a_1, a_2, ..., a_N$이라고 하자. 정균이가
$i$번째 날에 주식을 사고,
$j$번째 날에 판다면
$a_j - a_i$만큼의 이득을 얻을 수 있다. 정균이는 자금이 넉넉하기 때문에 주가가 아무리 높아도 주식을 살 수 있고, 상황이 여의치 않을 경우 사자마자 바로 팔 수도 있다.

앞으로
$N$일간 ANA 회사의 주가가 주어졌을 때, 정균이가 주식 한 주를 적당한 시점에 사고 적당한 시점에 팔아서 얻을 수 있는 최대 이득은 얼마일까?

입력
첫째 줄에 정수
$N(1 \le N \le 200\ 000)$이 주어진다.

두 번째 줄에 정수
$a_1, a_2, ..., a_N$이 주어진다.
$a_i(1 \le a_i \le 10^9)$는
$i$번째 날의 ANA 회사의 주가이다.

출력
ANA 회사의 주식 한 주를 적당한 시점에 사고 적당한 시점에 팔아서 얻을 수 있는 최대 이득을 출력한다.

예제 입력 1
5
4 2 3 1 5
예제 출력 1
4
예제 입력 2
3
3 2 1
예제 출력 2
0
예제 입력 3
4
7 1 2 6
예제 출력 3
5
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem478 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(input.readLine()); // 갯수
        int[] arr = new int[num]; // 주가 배열

        String[] value = input.readLine().split(" ");

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(value[i]);
        }


        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i]; // 최소 주가 할당
            } else {
                int temp = arr[i] - min;
                max = Math.max(max, temp); // 최대값 할당
            }
        }

        System.out.println(max);
    }
}

