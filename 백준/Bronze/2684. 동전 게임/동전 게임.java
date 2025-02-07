import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] coins = {"TTT", "TTH", "THT", "THH",
                          "HTT", "HTH", "HHT", "HHH"};

        int n = in.nextInt();
        in.nextLine();

        
        for(int i = 0; i < n; i++){
            String word = in.nextLine();
            int[] results = new int[8];

            for(int j = 0; j <= 37; j++){
                // 3개씩 자르기
                String compare = word.substring(j, j + 3);

                for(int k = 0; k < coins.length; k++){
                    if(compare.equals(coins[k])){
                        results[k]++;
                    }
                }
            }

            for(int result : results){
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}