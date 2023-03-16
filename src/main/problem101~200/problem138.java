/*
✅ 문제
N개의 원소를 포함하고 있는 수열이 오름차순으로 정렬되어 있습니다. 이때 이 수열에서 x가 등장하는 횟수를 계산하세요.
단, 이 문제의 시간 복잡도 O(logN)으로 알고리즘을 설계하지 않으면 '시간 초과' 판정을 받습니다.

입력 예시
7 2
1 1 2 2 2 2 3

출력 예시
4
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem138 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int match = in.nextInt();
        int [] arr = new int [size];
        int [] total = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            // 입력한 배열의 값에 따라 total 배열의 인덱스 값을 증가시켜준다.
            total[arr[i]]++;
        }
        // 찾고자 하는 값
        // 인덱스에 담겨있는 갯수를 반환한다.
        System.out.print(total[match]);

    }
}

