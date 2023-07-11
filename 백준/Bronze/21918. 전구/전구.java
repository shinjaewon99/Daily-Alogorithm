import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 전구의 개수
        int m = in.nextInt(); // 명령어의 개수

        int[] light = new int[n]; // 전구의 상태 배열
        for (int i = 0; i < n; i++) {
            light[i] = in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt(); // 명령어 번호
            int b = in.nextInt();
            int c = in.nextInt();

            if (a == 1) {
                light[b - 1] = c;
            } else if (a == 2) {
                for (int j = b - 1; j < c; j++) {
                    if (light[j] == 0) {
                        light[j] = 1;
                    } else {
                        light[j] = 0;
                    }
                }
            } else if (a == 3) {
                for (int j = b - 1; j < c; j++) {
                    light[j] = 0;
                }
            } else if (a == 4) {
                for (int j = b - 1; j < c; j++) {
                    light[j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(light[i] + " ");
        }
    }
}
