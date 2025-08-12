import java.util.*;

class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int length = word.length();

        int root = 0;
        int key = 0;

        while (key < length) {
            root++;
            String num = String.valueOf(root);

            // 문자열을 하나씩 잘라 비교
            for (char c : num.toCharArray()) {
                if (key < length && c == word.charAt(key)) {
                    key++;
                }
            }
        }

        System.out.println(root);
    }
}