import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 지방의수
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }
        
        int m = in.nextInt();

        int left = 0;
        int result = 0;

        Arrays.sort(numbers);

        int right = numbers[n - 1];
        
        // 이분 탐색 시작
        while(left <= right){
            int mid = (left + right) / 2;

            long temp = 0;

            for(int number : numbers){
                temp += Math.min(number, mid);
            }

            // 배정된 예산이 총 예산보다 작거나 같으면 상한액을 높임
            if(temp <= m){
                result = mid; // 현재 상한액 저장
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}