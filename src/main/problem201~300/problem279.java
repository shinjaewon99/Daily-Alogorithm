/*
문제
두 단어 A와 B가 주어졌을 때, A에 속하는 알파벳의 순서를 바꾸어서 B를 만들 수 있다면, A와 B를 애너그램이라고 한다.

두 단어가 애너그램인지 아닌지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 테스트 케이스의 개수(<100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 100을 넘지 않는 단어가 공백으로 구분되어서 주어진다. 단어는 알파벳 소문자로만 이루어져 있다.

출력
각 테스트 케이스마다 애너그램인지 아닌지를 예체 출력과 같은 형식으로 출력한다.

출력 형식
정확한 출력 형식은 제출에서 언어를 Java로 설정하면 확인할 수 있다.

예제 입력 1
3
blather reblath
maryland landam
bizarre brazier
예제 출력 1
blather & reblath are anagrams.
maryland & landam are NOT anagrams.
bizarre & brazier are anagrams.
*/
import java.util.Arrays;
import java.util.Scanner;

public class problem279 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        for (int i = 0; i < size; i++) {
            String a = in.next(); // 문자열 a 입력
            String b = in.next(); // 문자열 b 입력

            // char배열로 변환
            char[] c = a.toCharArray();
            char[] d = b.toCharArray();
            Arrays.sort(c);
            Arrays.sort(d);

            if (Arrays.equals(c, d)) {
                System.out.println(a + " & " + b + " are anagrams.");
            } else {
                System.out.println(a + " & " + b + " are NOT anagrams.");
            }
        }
    }
}

