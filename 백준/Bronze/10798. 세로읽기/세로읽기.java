import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char [][] arr= new char[5][15];

        for(int i = 0; i < 5; i++){
            // 총 다섯줄의 입력을 받는다.
            String input = in.next();
            for(int j = 0; j < input.length(); j++){
                arr[i][j] = input.charAt(j);
            }
        }

        for(int i = 0; i < 15; i++){
            // 총 다섯줄이고 세로 읽기를 해줘야됨으로 행이 이동되어야된다.
            for(int j = 0; j < 5; j++){
                // null값과 공백을 처리하기위해
                if(arr[j][i] == '\0') continue;
                sb.append(arr[j][i]);
            }
        }


        System.out.print(sb.toString());
    }

}
