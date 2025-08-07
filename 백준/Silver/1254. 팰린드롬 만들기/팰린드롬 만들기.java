import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        int length = word.length();
        
        for(int i = 0; i < length; i++){
            String compare = word.substring(i);

            String reverse = "";

            for(int j = compare.length() - 1; j >= 0; j--){
                reverse += compare.charAt(j);
            }

            // 자른단어가 뒤집어도 똑같다면
            if (compare.equals(reverse)) {
                System.out.println(length + i);  // 원래 길이 + 앞부분 덧붙일 문자 수
                return;
            }
        }
    }
}