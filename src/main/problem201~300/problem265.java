/*
송찬이는 시험을 치다가 갑자기 계산기의 배터리가 나가버렸다. 그래서 선생님께 배터리를 달라고 요구했는데, 요구하고 보니 카시오 계산기의 배터리가 어떤 종류인지 말을 안 해버렸다! 과연 선생님은 송찬이가 필요한 배터리 종류를 들고 왔을까?

입력
송찬이가 필요한 배터리 N과 선생님이 가져온 배터리 M이 입력된다.

N과 M은 둘다 최대 10자리 정수까지 들어올 수 있다.

출력
송찬이가 원한 배터리면 1을, 그 외엔 0을 출력한다.

예제 입력 1
1 1
예제 출력 1
1
예제 입력 2
1 0
예제 출력 2
0
*/

import java.util.Scanner;

public class problem265 {

    public static void main(String[] args) {

        // 간단한 구현문제이다.
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(); // 10자리 정수가 넘어가기 때문에 long타입
        long m = in.nextLong();

        if(n == m){
            System.out.print("1");
        }else{
            System.out.print("0");
        }


    }
}

