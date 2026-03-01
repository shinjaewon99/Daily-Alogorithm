import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] store = new int[n];

        for(int i = 0; i < n; i++){
            store[i] = in.nextInt();
        }

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += store[i];
        }

        int max = currentSum;

        for(int i = k; i < n; i++){

            // 한칸씩 이동해서 계산
            currentSum = currentSum - store[i - k] + store[i];
            
            // 최대값 갱신
            if(currentSum > max){
                max = currentSum;
            }
        }

        System.out.println(max);
        
    }
}