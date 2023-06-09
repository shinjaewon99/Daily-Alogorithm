/*
문제
문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.

출력
각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.

예제 입력 1
2
I am happy today
We want to win the first prize
예제 출력 1
I ma yppah yadot
eW tnaw ot niw eht tsrif ezirp
*/
import java.util.Scanner;

public class problem459 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine(); // 개행 제거


        while (size-- > 0) {
            StringBuilder output = new StringBuilder();
            String[] input = in.nextLine().split(" "); // 공백기준 split

            for (String str : input) {
                // 문자열 reverse
                StringBuilder reverse = new StringBuilder(str).reverse();
                output.append(reverse).append(" ");
            }
            System.out.print(output.toString());
            output.append("\n");
        }

    }
}


