/*
문제
그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

출력
첫째 줄에 그룹 단어의 개수를 출력한다.

예제 입력 1
3
happy
new
year
예제 출력 1
3
예제 입력 2
4
aba
abab
abcabc
a
예제 출력 2
1
예제 입력 3
5
ab
aa
aca
ba
bb
예제 출력 3
4
예제 입력 4
2
yzyzy
zyzyz
예제 출력 4
0
예제 입력 5
1
z
예제 출력 5
1
*/

import java.util.Scanner;

public class problem119 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int count = 0;
        for (int i = 0; i < size; i++) {
            String st = in.next();
            boolean check = check(st);
            if(check == true){
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean check(String st) {
        // 알파벳 배열 선언
        boolean [] arr = new boolean [26];
        int temp = 0;


        for (int i = 0; i < st.length(); i++) {
            // 현재 문자의 아스키코드값
            int now = st.charAt(i);

            /**
             * aaba 값이 입력 되었을때
             * a는 temp의 값이랑 달라 if문에 걸려 들어간다
             * 다음 a는 temp랑 now의 값이 같음으로 걸러들어가지않는다.
             */

            if(temp != now){
                // 해당 문자가 처음 등장한 경우 (false인경우), boolean 타입은 초기 설정값이 false이다.
                if(arr[now - 'a'] == false){
                    // 해당 문자가 처음 등장한경우 true로 변경해준다
                    arr[now - 'a'] = true;
                    temp = now;
                }
                // 해당 문자가 처음 등장하지 않은 경우
                else{
                    return false;
                }
            }

        }
        return true;
    }
}


