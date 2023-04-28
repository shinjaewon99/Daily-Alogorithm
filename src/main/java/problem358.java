/*
문제 설명
화학 숙제를 하던 광곽이는 분자량을 구하라는 문제를 보고 귀찮아 한다.

귀찮은 광곽이를 위해서 화학식을 입력하면 분자량을 구해주는 프로그램을 만들어 주자!

화학식은
의 꼴로 입력된다.

의 원자량은
,
의 원자량은
로 한다.

입력
화학식이
 꼴로 입력된다. (
)

인 경우에도
을 표시한다.

예)

출력
분자량을 출력한다.

입력 예시
C3H8

출력 예시
44
*/
import java.util.Scanner;

public class problem358 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // C3H20
        // H를 기준으로 split하기 때문에
        // inputString[0] = C3, inputString[1] = 20 으로 반환됩니다.
        String[] inputString = in.nextLine().split("H");

        String inputStringSub = inputString[0].substring(1);


        System.out.println(12 * Integer.parseInt(inputStringSub) + Integer.parseInt(inputString[1]));


    }
}
