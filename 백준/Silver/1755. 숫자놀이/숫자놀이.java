import java.util.*;

class Main {
    private static final String[] alpha = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();
        Map<String, Integer> wordStore = new TreeMap<>();

        for(int i = m; i <= n; i++){

            // 숫자가 10보다 작은경우
            if(i < 10){
                wordStore.put(alpha[i], i);
            }else{
                wordStore.put(alpha[i / 10] + " " + alpha[i % 10], i);
            }
        }

        int rn = 0;
        for(Integer value : wordStore.values()){
            System.out.print(value + " ");
            rn++;
            if(rn == 10){
                System.out.println();
                rn = 0;
            }
        }
    }
}