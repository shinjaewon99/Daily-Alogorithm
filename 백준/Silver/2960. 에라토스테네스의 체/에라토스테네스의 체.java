import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        boolean[] flag = new boolean[n + 1];
        int count = 0;

        // 소수는 2부터 시작하므로 for문 시작점을 2부터 시작
        for(int i = 2; i <= n; i++){
            for(int j = i; j <= n; j+=i){

                if(!flag[j]){
                    count++;
                    flag[j] = true;
                }
                    
                if(count == k){
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}