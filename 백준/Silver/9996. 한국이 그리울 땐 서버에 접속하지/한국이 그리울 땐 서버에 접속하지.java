import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        String compare = in.nextLine();
        String[] compares = compare.split("\\*");

        StringBuilder output = new StringBuilder();
        
        for(int i = 0; i < n; i++){
            String word = in.nextLine();

            // 비교 문자가 더 큰경우
            if(word.length() < compares[0].length() + compares[1].length()){
                output.append("NE").append("\n");
                continue;
            }

            if(word.startsWith(compares[0]) && word.endsWith(compares[1])){
                output.append("DA").append("\n");
            }else{
                output.append("NE").append("\n");
            }
        }

        System.out.println(output.toString());
    }
}