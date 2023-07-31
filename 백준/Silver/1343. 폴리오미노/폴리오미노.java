import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // 1. 입력을 받는다.
        // 2. AAAA를 기준으로 replace
        // 3. X 가 남게되는경우 -1 출력

        String a = "AAAA";
        String b = "BB";

        String result = "";
        String input = in.next();


        result = input.replace("XXXX", a);
        result = result.replace("XX", b);


        if (result.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}
