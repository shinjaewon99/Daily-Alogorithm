/*
문제
어느 날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.

미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.

입력
N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.

출력
미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.

예제 입력 1
30
예제 출력 1
30
예제 입력 2
102
예제 출력 2
210
예제 입력 3
2931
예제 출력 3
-1
예제 입력 4
80875542
예제 출력 4
88755420

*/
import java.util.*;
public class problem143 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String st = in.next();
        char [] ch = st.toCharArray();
        StringBuilder sb = new StringBuilder();
        int reverse = 0;
        Arrays.sort(ch);

        // 역순으로 담아준다.
        for(int i = ch.length - 1 ; i >= 0; i--){
            reverse += ch[i] - '0';
            sb.append(ch[i]);
        }

        // 0으로 시작하거나, 3의 배수가 아니라면 (30의 배수 = 3의배수)
        if(ch[0] != '0'  || reverse % 3 != 0){
            System.out.print(-1);

        }else {
            System.out.print(sb.toString());
        }

    }
}

