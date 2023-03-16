/*
[문제]

알파벳 대문자와 숫자 (0~9)로만 구성된 문자열이 입력으로 주어집니다.
이때 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에,
그 뒤에 모든 숫자를 더한 값을 이어서 출력합니다.
예를 들어 K1KA5CB7이 입력으로 들어오면, ABCKK13을 출력합니다.

[입력]

K1KA5CB7

[출력]

ABCKK13


[입력]

FDSARQWER13579

[출력]

ADEFQRRSW25
*/
import java.util.*;

public class problem132 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String st = in.next();
        char [] ch = st.toCharArray();
        Arrays.sort(ch);

        int sum = 0;
        for(char c : ch){
            if(Character.isDigit(c)){
                // 아스키 값 정수 계산을 위해 '0'을 빼준다.
                sum += c - '0';
            }else{
                sb.append(c);
            }
        }
        System.out.print(sb.toString() + sum);
    }
}
