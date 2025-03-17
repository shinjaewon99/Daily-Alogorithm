import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 카드의 갯수

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }
        System.out.println(findResult(numbers));
    }

    private static int findResult(int[] numbers){
        int length = numbers.length;
        int[] dp = new int[length];
        int count = 1;
        
        Arrays.fill(dp, 1); // 초기값의 길이는 자기 자신 1

        for(int i = 1; i < length; i++){
            for(int j = 0; j < i; j++){
                // 연속된 수열인지 확인
                if(numbers[j] < numbers[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            count = Math.max(count, dp[i]);
        }

        return count;
    }
}