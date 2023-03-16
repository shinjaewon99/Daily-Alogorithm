/*
문제
하루에 한 시간 단위로 일을 하거나 일을 쉬어도 된다. 하루에 한 시간 일하면 피로도는
$A$ 만큼 쌓이고 일은
$B$ 만큼 처리할 수 있다.

만약에 한 시간을 쉰다면 피로도는
$C$ 만큼 줄어든다. 단, 피로도가 음수로 내려가면 0으로 바뀐다. 당연히 일을 하지 않고 쉬었기 때문에 처리한 일은 없다.

피로도를 최대한
$M$ 을 넘지 않게 일을 하려고 한다.
$M$ 를 넘기면 일하는데 번아웃이 와서 이미 했던 일들도 다 던져버리고 일을 그만두게 된다.

번아웃이 되지 않도록 일을 할때 하루에 최대 얼마나 일을 할 수 있는지 구해보자. 하루는 24시간이다.

입력
첫 번째 줄에 네 정수
$A$,
$B$,
$C$,
$M$이 공백으로 구분되어 주어진다.

맨 처음 피로도는 0이다.

출력
하루에 번 아웃이 되지 않도록 일을 할 때 최대 얼마나 많은 일을 할 수 있는지 출력한다.

제한
 
$1 \le A \le 1,000,000$ 
 
$1 \le B \le 10,000$ 
 
$1 \le C \le 10,000$ 
 
$1 \le M \le 1,000,000$ 
예제 입력 1
5 3 2 10
예제 출력 1
24
예제 입력 2
10 5 1 10
예제 출력 2
15
예제 입력 3
11 5 1 10
예제 출력 3
0
*/
import java.util.Scanner;

public class problem178 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int time = 24;

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int count = 0;
        int max = 0;

        while (time != 0) {
            // 피로도가 번아웃이 온경우
            if(a > d){
                break;
            } else if(max + a <= d){
                count += b;
                max += a;
            }else{
                max -= c;
                // 현재 피로도가 음수일 경우
                if (max < 0){
                    max = 0;
                }
            }
            time--;
        }
        System.out.print(count);
    }
}

