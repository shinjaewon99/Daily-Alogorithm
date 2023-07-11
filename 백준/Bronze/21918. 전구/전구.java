import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 전구의 갯수
        int m = in.nextInt(); // 명령어의 갯수

        int[] light = new int[n]; // 전구의 상태 배열
        for (int i = 0; i < n; i++) {
            light[i] = in.nextInt();
        }

        while (m-- > 0) {
            int a = in.nextInt(); // 명령어 번호
            int b = in.nextInt();
            int c = in.nextInt();

            // 1번 명령어
            if (a == 1) {
                light[b - 1] = c;
            } else if (a == 2) {
                for (int i = b - 1; i < c; i++) {
                    // 전구가 꺼져 있는경우
                    if (light[i] == 0) {
                        light[i] = 1;
                    }
                    // 전구가 켜져 있는 경우
                    else{
                        light[i] = 0;
                    }
                }
            } else if (a == 3) {
                for (int i = b - 1; i < c; i++) {
                    light[i] = 0;
                }

            } else if(a == 4) {
                for (int i = b - 1; i < c; i++) {
                    light[i] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(light[i] + " ");
        }

    }
}
