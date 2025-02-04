import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        StringBuilder output = new StringBuilder();

        int index = 0;

        while(index < word.length()){
            char ch = word.charAt(index);
            output.append(ch);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                index += 2; // 'p'와 반복된 모음 스킵
            }

            index++;
        }

        System.out.println(output.toString());
    }
}