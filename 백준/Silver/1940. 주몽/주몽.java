import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int m = in.nextInt();
        int result = 0;

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);

        // 투포인터 사용
        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == m){
                left++;
                right--;
                result++;
            }else if(sum < m){
                left++;
            }else{
                right--;
            }
        }
        
        System.out.println(result);
        
    }
}
