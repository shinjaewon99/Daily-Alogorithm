/*
문제
세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

입력
세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

출력
직사각형의 네 번째 점의 좌표를 출력한다.

예제 입력 1
5 5
5 7
7 5
예제 출력 1
7 7
예제 입력 2
30 20
10 10
10 20
예제 출력 2
30 10
*/
import java.util.Scanner;

public class problem253 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] x = new int[3];
        int [] y = new int[3];

        for(int i = 0; i < 3; i++){
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        // x 좌표, y 좌표 한개만 입력된 좌표를 출력해준다.

        int nowX, nowY;
        if(x[0] == x[1]){
            nowX = x[2];
        }else if(x[0] == x[2]){
            nowX = x[1];
        }else{
            nowX = x[0];
        }

        if(y[0] == y[1]){
            nowY = y[2];
        }else if(y[0] == y[2]){
            nowY = y[1];
        }else{
            nowY = y[0];
        }
        System.out.print(nowX + " " + nowY);
    }
}
