import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        int count = 0;
        int start = 0, end = 0, sum = 0;

        while(end < n){
            // 투포인터 접근
            sum += store[end];

            while(sum > m){
                sum -= store[start];
                start++;
            }
            
            if(sum == m){
                count++;
            }

            end++;
        }

        System.out.println(count);
    }
}