/*
문제
다솜이는 사람의 마음을 읽을 수 있는 기계를 가지고 있다. 다솜이는 이 기계를 이용해서 2008년 4월 9일 국회의원 선거를 조작하려고 한다.

다솜이의 기계는 각 사람들이 누구를 찍을 지 미리 읽을 수 있다. 어떤 사람이 누구를 찍을 지 정했으면, 반드시 선거때 그 사람을 찍는다.

현재 형택구에 나온 국회의원 후보는 N명이다. 다솜이는 이 기계를 이용해서 그 마을의 주민 M명의 마음을 모두 읽었다.

다솜이는 기호 1번이다. 다솜이는 사람들의 마음을 읽어서 자신을 찍지 않으려는 사람을 돈으로 매수해서 국회의원에 당선이 되게 하려고 한다. 다른 모든 사람의 득표수 보다 많은 득표수를 가질 때, 그 사람이 국회의원에 당선된다.

예를 들어서, 마음을 읽은 결과 기호 1번이 5표, 기호 2번이 7표, 기호 3번이 7표 라고 한다면, 다솜이는 2번 후보를 찍으려고 하던 사람 1명과, 3번 후보를 찍으려고 하던 사람 1명을 돈으로 매수하면, 국회의원에 당선이 된다.

돈으로 매수한 사람은 반드시 다솜이를 찍는다고 가정한다.

다솜이가 매수해야하는 사람의 최솟값을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 후보의 수 N이 주어진다. 둘째 줄부터 차례대로 기호 1번을 찍으려고 하는 사람의 수, 기호 2번을 찍으려고 하는 수, 이렇게 총 N개의 줄에 걸쳐 입력이 들어온다. N은 50보다 작거나 같은 자연수이고, 득표수는 100보다 작거나 같은 자연수이다.

출력
첫째 줄에 다솜이가 매수해야 하는 사람의 최솟값을 출력한다.

예제 입력 1
3
5
7
7
예제 출력 1
2
예제 입력 2
4
10
10
10
10
예제 출력 2
1
예제 입력 3
1
1
예제 출력 3
0
예제 입력 4
5
5
10
7
3
8
예제 출력 4
4
*/
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class problem163 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int d = in.nextInt();

        // 후보자가 혼자인경우
        if (size == 1) {
            System.out.print(0);
            return;
        }
        Integer[] arr = new Integer[size - 1];

        for (int i = 0; i < size - 1; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;

        while (true) {
            // 내림차순으로 while문이 탈출될때까지 정렬한다.
            Arrays.sort(arr, Comparator.reverseOrder());

            // while문 탈출 조건을 위해 boolean
            boolean flag = true;
            int max = arr[0]; // 후보를 찍을려고 하는 수 중 최대
            if (d <= max) {
                count++;
                d++;
                arr[0]--;
                flag = false; // max값보다 d값이 커지게되면 flag는 true로 초기화 하였기때문에 while문을 탈출한다.
            }
            if (flag)
                break;
        }
        System.out.print(count);
    }
}
