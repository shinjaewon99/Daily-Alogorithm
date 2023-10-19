import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. 크기입력, 배열 크기지정
        StringBuilder output = new StringBuilder();
        int size = in.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        // 2. 배열의 값 입력
        for (int i = 0; i < size; i++) {
            arr1[i] = in.nextInt();
            arr2[i] = arr1[i];
        }

        // 3. 오름차순 정렬
        Arrays.sort(arr2);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr1[i] == arr2[j]) {
                    output.append(j).append(" ");
                    // 4. 배열에서 값을 찾았으면 -1으로 할당, 추가적인 탐색을 막기위해
                    arr2[j] = -1;
                    break;
                }
            }
        }

        System.out.println(output.toString());
    }
}