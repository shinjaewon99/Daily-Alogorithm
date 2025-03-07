import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int[] numbers = new int[n];
        Arrays.fill(numbers, k);

        int day = 0;

        while(true){
            day++; // 일수 증가

            int min = 0;
            for(int i = 1; i <= n - a; i++){
                if(numbers[i] < numbers[min]){
                    min = i;
                }
            }

            for(int i = 0; i < a; i++){
                numbers[min + i] += b;
            }

            // 모든화분 수분감소
            for(int i = 0; i < n; i++){
                numbers[i]--;

                if(numbers[i] == 0){
                    System.out.println(day);
                    return;
                }
            }
        }
        
    }
}