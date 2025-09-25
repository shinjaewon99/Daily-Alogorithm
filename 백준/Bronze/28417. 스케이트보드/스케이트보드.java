import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int[] run = new int[2];
        int[] trick = new int[5];
        int score = 0;
        int maxScore = 0;
        
        for(int i = 0; i < t; i++){

            for(int j = 0; j < 2; j++){
                run[j] = in.nextInt();
            }

            Arrays.sort(run);

            for(int k = 0; k < 5; k++){
                trick[k] = in.nextInt();
            }

            Arrays.sort(trick);

            score = run[1] + trick[3] + trick[4];
            maxScore = Math.max(maxScore, score);
        }

        System.out.println(maxScore);
    }
}