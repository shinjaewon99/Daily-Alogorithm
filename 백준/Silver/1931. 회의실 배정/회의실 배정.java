import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 회의의 수
        int[][] info = new int[n][2];

        for (int i = 0; i < n; i++) {
            info[i][0] = in.nextInt(); // 시작 시간
            info[i][1] = in.nextInt(); // 끝나는 시간
        }

        Arrays.sort(info, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                
                // 종료 시간이 같다면 시작 시간이 빨라야 된다.
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                
                // 시작시간 순으로 오름차순
                return o1[1] - o2[1];
            }
        });

        int count = 1; // 처음 시작한 회의도 1개로 세어줘야 한다.
        int compare = info[0][1];
        for (int i = 1; i < n; i++) {
            if (info[i][0] >= compare) {
                count++;
                compare = info[i][1];
            }
        }
        System.out.println(count);
    }
}
