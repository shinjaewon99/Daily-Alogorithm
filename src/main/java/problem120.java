/*
괄호 문자 제거
입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하시오.

입력 설명
첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.

출력 설명
남은 문자만 출력한다

입력 예제 1
(A(BC)D)EF(G(H)(IJ)K)LM(N)

출력 예제 1
EFLM
* */
import java.util.Scanner;
import java.util.Stack;

public class problem120 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Stack<Character> st = new Stack<>();

        String a = in.next();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == ')') {
                /** '(' 여는 괄호를 만나지 않을때까지
                 pop = 최상단의 값을 return 해줌
                 예 : (AB)가 입력되었을시, '('을 만날때 까지 pop을 함으로 " "값이 반환
                 **/
                while(st.pop() != '(');
            } else {
                st.push(ch);
            }

        }
        String result ="";
        for(int i = 0; i < st.size(); i++){
            result += st.get(i);
        }
        System.out.print(result);
    }
}





