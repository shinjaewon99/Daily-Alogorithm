/*
문제
희연이는 스웨덴으로 이사하여 현재 학교를 다니고 있다. 1학년 교육과정은 중국에서 배웠고, 스웨덴과 중국 두 나라의 교육과정은 완전히 다르다. 희연이는 수학을 좋아한다. 하지만 지금은... 선생님은 칠판에 뺄셈을 설명하고 있어서 희연이는 수업에 흥미가 없다. 칠판에 있는 수들을 역 이진법으로 나타낸 수들로 같은 계산을 수행하는 것이 가능할까? 희연이는 몽상을 하며 시간을 보냈고, 머릿속으로 역 이진법 표시 프로그램을 구상하기 시작했다. 수업이 끝나는대로 희연이는 집에가서 컴퓨터에 그것들을 적을 것이다.

당신이 할 일은 역 이진법 프로그램을 작성하는 것이다. 예를 들어 13을 2진법으로 나타내면 1101이고, 이것을 뒤집으면 1011이 된다. 이 수를 다시 10진법으로 나타내면 11이다.

입력
입력은 한 줄에 정수 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.

출력
입력받은 N을 2진법으로 나타낸 뒤 뒤집어, 다시 10진법으로 나타낸 수를 출력한다.

예제 입력 1
13
예제 출력 1
11
예제 입력 2
47
예제 출력 2
61
*/
import java.util.Scanner;

public class problem285 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();

        // Integer.toBinaryString() : 2진수 문자열로 변환
        String temp = Integer.toBinaryString(n);
        sb.append(temp);
        sb.reverse();

        // 2진수 문자열을 10진수 정수로 변환
        System.out.print(Integer.parseInt(sb.toString(), 2));
    }
}
