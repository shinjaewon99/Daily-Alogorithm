/*
문제
문자열 s가 있을 때, f(s)는 s를 무한번 붙인 문자열로 정의한다. 예를 들어, s = "abc" 인 경우에 f(s) = "abcabcabcabc..."가 된다.

다른 문자열 s와 t가 있을 때, f(s)와 f(t)가 같은 문자열인 경우가 있다. 예를 들어서, s = "abc", t = "abcabc"인 경우에 f(s)와 f(t)는 같은 문자열을 만든다.

s와 t가 주어졌을 때, f(s)와 f(t)가 같은 문자열을 만드는지 아닌지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 s, 둘째 줄에 t가 주어진다. 두 문자열 s와 t의 길이는 50보다 작거나 같은 자연수이고, 알파벳 소문자로만 이루어져 있다.

출력
첫째 줄에 f(s)와 f(t)가 같으면 1을, 다르면 0을 출력한다.

예제 입력 1
ab
abab
예제 출력 1
1
예제 입력 2
abc
bca
예제 출력 2
0
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class problem482 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int str1Length = str1.length();
        int str2Length = str2.length();

        StringBuilder temp1 = new StringBuilder(str1);
        StringBuilder temp2 = new StringBuilder(str2);

        if(str1Length != str2Length){

            int lcm = lcm(str1Length, str2Length);

            while(temp1.length() != lcm){
                temp1.append(str1);
            }

            while(temp2.length() != lcm){
                temp2.append(str2);
            }
        }

        if(temp1.toString().equals(temp2.toString())){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}

