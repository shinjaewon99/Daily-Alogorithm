import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int index = in.nextInt();
            String word = in.next(); 

            output.append(word.substring(0, index - 1)); 
            output.append(word.substring(index)); 
            output.append("\n"); 
        }

        System.out.println(output.toString());
    }
}