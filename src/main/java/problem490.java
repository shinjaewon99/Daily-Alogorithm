/*
문제
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.

예제 입력 1
10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10
예제 출력 1
3 0 0 1 2 0 0 2
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class problem490 {
    public static void main(String[] args) throws IOException {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(in.readLine());
        int[] sang = new int[size];
        Map<Integer, Integer> map = new HashMap<>();
        String[] sangArr = in.readLine().split(" ");

        for (int i = 0; i < size; i++) {
            sang[i] = Integer.parseInt(sangArr[i]);

            // key값 (상근이 숫자)가 있는경우 누적 + 1,
            map.put(sang[i], map.getOrDefault(sang[i], 0) + 1);
        }

        int compareSize = Integer.parseInt(in.readLine());
        int[] compareArr = new int[compareSize];
        String[] compare = in.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < compareSize; i++) {
            compareArr[i] = Integer.parseInt(compare[i]);

            // map 객체에 비교한 값이 있는경우
            if (map.containsKey(compareArr[i])) {
                sb.append(map.get(compareArr[i])).append(" ");
            } else {
                sb.append("0").append(" ");
            }
        }
        System.out.print(sb.toString());
    }
}
