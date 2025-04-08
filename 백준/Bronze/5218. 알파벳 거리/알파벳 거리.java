import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        in.nextLine();
        
        
        for(int i = 0; i < number; i++){
            String[] word = in.nextLine().split(" ");

            String word1 = word[0];
            String word2 = word[1];
            
            StringBuilder output = new StringBuilder();

            output.append("Distances: ");
            
            int length = word1.length();
            for(int j = 0; j < length; j++){
                int index = 0;

                int ch1 = word1.charAt(j) - 'A' + 1; // A = '1' 로 계산
                int ch2 = word2.charAt(j) - 'A' + 1;

                if(ch1 <= ch2){
                    index = ch2 - ch1;
                }else{
                    index = (ch2 + 26) - ch1;
                }
                output.append(index).append(" ");
            }

            System.out.println(output.toString());
        }
    }
}