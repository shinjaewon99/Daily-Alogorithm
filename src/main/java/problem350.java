/*
문제
2개의 문자열 s와 t가 주어졌을 때 s가 t의 부분 문자열인지 판단하는 프로그램을 작성하라. 부분 문자열을 가지고 있는지 판단하는 방법은 t에서 몇 개의 문자를 제거하고 이를 순서를 바꾸지 않고 합쳤을 경우 s가 되는 경우를 이야기 한다.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문자열 s 와 t가 빈칸을 사이에 두고 들어온다. s와 t의 길이는 10만을 넘지 않는다.

출력
입력된 s와 t의 순서대로 s가 t의 부분 문자열인 경우 Yes라 출력하고 아닐 경우 No라고 출력한다.

예제 입력 1
sequence subsequence
person compression
VERDI vivaVittorioEmanueleReDiItalia
caseDoesMatter CaseDoesMatter
예제 출력 1
Yes
No
Yes
No
*/

import java.util.Scanner;

public class problem350 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 다음 입력이 없을때 까지 반복
        while (in.hasNextLine()) {
            // 공백을 기준으로 배열로 나눔
            String[] inputString = in.nextLine().split(" ");


            int index = 0;

            // 문자 비교
            for (int i = 0; i < inputString[1].length(); i++) {
                if (inputString[0].charAt(index) ==
                        inputString[1].charAt(i)) {
                    index++;
                }

                // index가 inputString의 길이랑 같을때 break
                if (index == inputString[0].length()) {
                    break;
                }
            }

            // 같다는것은 문자가 다 포함한다는것
            if (index == inputString[0].length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

