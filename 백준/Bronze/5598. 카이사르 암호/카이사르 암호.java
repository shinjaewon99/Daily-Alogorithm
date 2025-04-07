import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        StringBuilder output = new StringBuilder();

        for(char ch : word.toCharArray()){
            char result = (char) ('A' + (ch - 'A' + 23) % 26);
            output.append(result);
        }

        System.out.println(output.toString());
    }
}