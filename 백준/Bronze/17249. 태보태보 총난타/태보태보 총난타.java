import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String[] words = word.split("\\(\\^0\\^\\)");

        int count1 = 0;
        int count2 = 0;
        
        if (words.length > 0) {
            for (char find : words[0].toCharArray()) {
                if (find == '@') {
                    count1++;
                }
            }
        }

        if (words.length > 1) {
            for (char find : words[1].toCharArray()) {
                if (find == '@') {
                    count2++;
                }
            }
        }

        System.out.println(count1 + " " + count2);
    }
}