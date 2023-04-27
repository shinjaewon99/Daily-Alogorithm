/*
문제
숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 수가 적혀있는 경우는 없다.

셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다

출력
첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.

예제 입력 1
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10
예제 출력 1
1 0 0 1 1 0 0 1
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem354 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] sizeArr = new int[size];

        for (int i = 0; i < size; i++) {
            sizeArr[i] = in.nextInt();
        }
        // 이진 탐색을 위한 정렬
        // -10 2 3 6 10
        Arrays.sort(sizeArr);

        int m = in.nextInt(); // 비교할 카드 갯수
        int[] target = new int[m];
        for (int i = 0; i < m; i++) {
            target[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            boolean isSearch = search(sizeArr, target[i]);

            if(isSearch){
                System.out.print("1" + " ");
            }else{
                System.out.print("0" + " ");
            }
        }
    }

    // 이진 탐색 메소드
    private static boolean search(int[] cards, int target) {
        int start = 0;
        int end = cards.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // cards 배열에 target 번호가 있는경우
            if (cards[mid] == target) {
                return true;
            } else if (cards[mid] < target) {
                // 내림차순으로 정렬했음으로,
                // 더 큰값이라는것은 오른쪽에 위치할수 있다는것임으로. + 1 해주었다.
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

}