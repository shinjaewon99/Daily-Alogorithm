/*
문제 :
각 자리가 숫자(0부터 9)로만 이루어진 문자열 S가 주어졌을 때, 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며 숫자 사이에 '' 혹은 '+' 연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성하세요. 단, +보다 를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서부터 순서대로 이루어진다고 가정합니다.
예를 들어 02984라는 문자열이 주어지면, 만들어질 수 있는 가장 큰수는 ((((0+2)9)8)*4) = 576 입니다.

입력조건 :
첫째 줄에 여러 개의 숫자로 구성도니 하나의 문자열 S가 주어집니다. (1<=S의 길이<=20)

출력 조건 :
첫째 줄에 만들어질 수 있는 가장 큰 수를 출력합니다.

입력 예시 1
02984
출력 예시1
576

입력 예시2
567
출력 예시2
210
*/
import java.util.Scanner;

public class problem127 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String st = in.next();

        // 정수 값을 담을 배열
        int [] arr = new int[st.length()];
        int total = 0;

        for(int i = 0; i < st.length(); i++){
            // 문자 아스키 값을 '0'을 빼줌으르써 정수값에 대응된다.
            arr[i] = st.charAt(i) - '0';
        }

        for(int i = 0; i < arr.length; i++){
            if(total == 0) {
                total += arr[i];
            }
            // 정수값이 0 이나 1 일경우는 더하는게 최대값이다.
            else if(arr[i] == 0 || arr[i] == 1){
                total += arr[i];
            }else{
                total *= arr[i];
            }
        }
        System.out.print(total);
    }
}

