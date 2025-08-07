import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        int totalSum = 0;

        for(int i = 65; i <= 90; i++){
            totalSum += i;
        }

        for(int i = 0; i < t; i++){
            String word = in.nextLine();

            boolean[] flag = new boolean[26];

            for(char compare : word.toCharArray()){
                flag[compare - 'A'] = true;
            }

            int result = 0;
            for(int j = 0; j < 26; j++){
                if(flag[j]){
                    result += (j + 65);
                }
            }
            
            System.out.println(totalSum - result);
        }
    }
}