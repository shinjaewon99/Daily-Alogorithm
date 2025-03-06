import java.util.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();

        // 정규식 작성
        String reg = "^[ABCDEF]?A+F+C+[ABCDEF]?$";

        for(int i = 0; i < t; i++){
            String word = in.nextLine();

            if(Pattern.matches(reg, word)){
                System.out.println("Infected!");
            }else{
                System.out.println("Good");
            }
        }
    }
}