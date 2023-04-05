/*
문제
크기가 N인 수열 A가 주어졌을 때, 세준이는 인접한 두 원소의 차이를 이용해서 크기가 N-1인 수열 B를 만들 수 있다.

예를 들어, A = {5, 6, 3, 9, -1} 이었을 때, B = {6-5, 3-6, 9-3, -1-9} = {1, -3, 6, -10}이 된다. 즉, B[i] = A[i+1]-A[i]가 된다.

수열 A가 주어졌을 때, 세준이가 위의 방법을 K번 했을 때 나오는 수열을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수열의 크기 N과 K가 주어진다. N은 20보다 작거나 같은 자연수이고, K는 0보다 크거나 같고, N-1보다 작거나 같은 정수이다. 둘째 줄에는 수열이 ‘,’로 구분되어 주어진다. 수열을 이루고 있는 수는 절댓값이 100보다 작거나 같은 정수이다.

출력
첫째 줄에 K번 변형한 수열을 ‘,’로 구분하여 출력한다.

예제 입력 1
5 1
5,6,3,9,-1
예제 출력 1
1,-3,6,-10
예제 입력 2
5 2
5,6,3,9,-1
예제 출력 2
-4,9,-16
예제 입력 3
5 4
5,6,3,9,-1
예제 출력 3
-38
예제 입력 4
8 3
4,4,4,4,4,4,4,4
예제 출력 4
0,0,0,0,0
예제 입력 5
2 0
-100,100
예제 출력 5
-100,100
*/
import java.util.Scanner;

public class problem277 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int cut = in.nextInt();
        int[] arr = new int[size];

        String[] str = in.next().split(",");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }

        // 몇번 반복할지 for문
        for (int i = 0; i < cut; i++) {
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1] - arr[j]; // k번 했을경우 arr 배열이 갱신
            }
        }

        for (int i = 0; i < size - cut; i++) {
            System.out.print(arr[i]);

            // 마지막값을 출력후 쉼표를 출력하지 않기위해
            if (i != size - cut - 1) {
                System.out.print(",");
            }
        }
    }
}

