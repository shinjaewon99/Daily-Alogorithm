import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int[][] store = new int[size][3];

        // 1. 학생의 정보 입력
        for (int i = 0; i < size; i++) {
            store[i][0] = in.nextInt(); // 학생의 국가번호
            store[i][1] = in.nextInt(); // 학생 번호
            store[i][2] = in.nextInt(); // 성적
        }

        // 2. 성적순으로 내림차순 정렬
        Arrays.sort(store, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        // 3. 1등과 2등의 국가가 다를경우 3등을 찾기위한 인덱스
        int max = 2;

        // 4. 1등과 2등의 국가가 같을경우
        if (store[0][0] == store[1][0]) {
            // 5. 다음 국가에서 최대 점수를 찾는다
            for (int i = 2; i < size; i++) {
                if (store[0][0] != store[i][0]) {
                    max = i;
                    break;
                }
            }
        }

        // 상위 세 명의 학생 출력
        System.out.println(store[0][0] + " " + store[0][1]);
        System.out.println(store[1][0] + " " + store[1][1]);
        System.out.println(store[max][0] + " " + store[max][1]);
    }
}

