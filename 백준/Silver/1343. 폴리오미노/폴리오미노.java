import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = "AAAA";
        String b = "BB";
        String word = in.nextLine();

        String result = "";

        // 1. 문자열 대체
        result = word.replace("XXXX", a);
        result = result.replace("XX", b);


        // 2. 대체한 문자열에 X가 포함되어 있는 경우
        if(result.contains("X")){
            System.out.println("-1");
        }else{
            System.out.println(result);
        }
    }
}
