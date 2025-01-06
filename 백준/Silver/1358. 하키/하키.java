import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int w = in.nextInt();  // 직사각형의 너비
        int h = in.nextInt();  // 직사각형의 높이
        int x = in.nextInt();  // 직사각형의 왼쪽 아래 x좌표
        int y = in.nextInt();  // 직사각형의 왼쪽 아래 y좌표
        int p = in.nextInt();  // 선수의 수

        int radius = h / 2;  // 원의 반지름
        int circle1X = x;        // 왼쪽 원의 중심 x좌표
        int circle1Y = y + radius; // 왼쪽 원의 중심 y좌표
        int circle2X = x + w;      // 오른쪽 원의 중심 x좌표
        int circle2Y = y + radius; // 오른쪽 원의 중심 y좌표

        int count = 0;

        for (int i = 0; i < p; i++) {
            int px = in.nextInt();
            int py = in.nextInt();

            // 직사각형 안에 있는지 확인
            boolean intSqu = (px >= x && px <= x + w && py >= y && py <= y + h);

            // 왼쪽 원 안에 있는지 확인
            boolean inCircle1 = Math.pow(px - circle1X, 2) + Math.pow(py - circle1Y, 2) <= Math.pow(radius, 2);

            // 오른쪽 원 안에 있는지 확인
            boolean inCircle2 = Math.pow(px - circle2X, 2) + Math.pow(py - circle2Y, 2) <= Math.pow(radius, 2);

            // 링크 안에 있는지 확인
            if (intSqu || inCircle1 || inCircle2) {
                count++;
            }
        }

        System.out.println(count);
    }
}
