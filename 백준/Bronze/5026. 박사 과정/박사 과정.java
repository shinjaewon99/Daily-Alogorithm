import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();

        StringBuilder output = new StringBuilder();
        
        while(t --> 0){
            String word = in.nextLine();
            if (word.equals("P=NP")) {
                output.append("skipped").append("\n");
            } else {
                String[] words = word.split("\\+");
                int sum = Integer.parseInt(words[0]) + Integer.parseInt(words[1]);
                output.append(sum).append("\n");
            }
        }

        System.out.println(output.toString());
    }
}