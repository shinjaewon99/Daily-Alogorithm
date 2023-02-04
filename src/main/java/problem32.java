/*
알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

예제 입력 1
Mississipi
예제 출력 1
?
예제 입력 2
zZa
예제 출력 2
Z
예제 입력 3
z
예제 출력 3
Z
예제 입력 4
baaa
예제 출력 4
A
*/

import java.util.Scanner;

public class problem32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 알파벳의 갯수가 26개이다
        int [] alphabet = new int[26];
        String inputString = in.next();

        for (int i = 0; i < inputString.length(); i++) {
            if('A' <= inputString.charAt(i) && inputString.charAt(i) <= 'Z'){
                // 대문자
                // 26개 인덱스 중 해당 인덱스를 알파벳 갯수만큼 증가해준다.
                // - 'A'로 한 이유는 알파벳은 A보다 큼
                alphabet[inputString.charAt(i) - 'A']++;
            }
            else{
                //소문자
                alphabet[inputString.charAt(i) - 'a']++;
            }
        }
        // -1 인 이유는 26개 알파벳중 입력되지 않은 알파벳이 있을수 있음으로
        int max = -1;
        char temp = '?';

        // aa bb = ?
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] > max){
                max = alphabet[i];
                temp = (char) (i + 65); // 대문자로 출력해야됨으로 65를 더해준다.
            } else if (alphabet[i] == max) {
                temp = '?';
            }
        }
        System.out.println(temp);

    }
}
