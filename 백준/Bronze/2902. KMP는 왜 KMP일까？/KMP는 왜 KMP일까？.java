import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String[] words = word.split("-");
        StringBuilder output = new StringBuilder();

        for(String result : words){
            char ch = result.charAt(0);
            output.append(ch);
        }

        System.out.println(output.toString());
    }
}