/*
문제
N개의 수가 주어졌을 때, 이를 내림차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 내림차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

예제 입력 1
5
1
2
3
4
5
예제 출력 1
5
4
3
2
1
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class problem300 {


    public static void main(String[] args) throws IOException {
        // Scanner 입력과, println을 사용하면 시간초과로 인해 버퍼와, writer사용
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer
                = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Integer arr[] = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr, Collections.reverseOrder());
        // 내림차순으로 출력
        for (Integer i : arr) {
            writer.write(i + "\n");
        }
        writer.flush();
    }
}

