/*
문제
2월 18일은 올해 CCC에 있어서 특별한 날이다.

사용자로부터 정수인 월과 일을 입력받아 날짜가 2월 18일인지 전인지 후인지를 출력하는 프로그램이다.

만약 날짜가 2월 18일 전이면, "Before"을 출력한다. 만약 날짜가 2월 18일 후면, "After"을 출력한다. 만약 2월 18일이라면 "Special" 을 출력한다.

입력
입력은 두 개의 정수가 각 줄에 걸쳐 입력된다. 이 정수들은 2015년의 날짜에 포함된다.

첫 번째 줄은 1에서 12사이의 월을 입력한다.

두 번째 줄은 1에서 31사이의 그 달에 들어있는 날짜를 입력한다 .

출력
마지막 줄에 "Before", "After"나 "Special"을 출력한다.

예제 입력 1
1
7
예제 출력 1
Before
예제 입력 2
8
31
예제 출력 2
After
예제 입력 3
2
18
예제 출력 3
Special
*/
import java.util.Scanner;

public class problem264 {

    public static void main(String[] args) {

        // 간단한 구현문제이다.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if(n < 2){
            System.out.print("Before"); // 2월보다 낮을경우
        }else if (n == 2){
            if(m < 18){
                System.out.print("Before");
            }else if(m > 18){
                System.out.print("After");
            }else{
                System.out.print("Special");
            }
        }else{
            System.out.print("After");
        }

    }
}
