import java.util.*;

class Main {
    private static int n;
    private static int m;
    private static int[] dp;
    private static List<Integer>[] store;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); // 과목의 수
        m = in.nextInt(); // 선수 조건의 수

        store = new ArrayList[n + 1];
        dp = new int[n + 1];
        
        for(int i = 1; i <= n; i++){
            store[i] = new ArrayList<>();
        }
        
        // 초기값 세팅
        Arrays.fill(dp, 1);

        for(int i = 0; i < m; i++){
            int startIndex = in.nextInt();
            int endIndex = in.nextInt();

            store[startIndex].add(endIndex);
        }

        
        for(int i = 1; i <= n; i++){
            if(store[i].isEmpty()){
                continue;
            }
            
            for(int num : store[i]){
                dp[num] = Math.max(dp[num], dp[i] + 1);
            }
        }
        
        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            output.append(dp[i]).append(" ");
        }
        System.out.println(output.toString());
    }
}