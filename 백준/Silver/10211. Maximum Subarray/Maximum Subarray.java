import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int[] numbers = new int[n];
           
            for(int j = 0; j < n; j++){
                numbers[j] = in.nextInt();
            }
            
            int result = calcu(numbers);

            
            System.out.println(result);
        }
    }

    private static int calcu(int[] numbers){
        int current = numbers[0];
        int max = numbers[0];
            
        for(int i = 1; i < numbers.length; i++){
            // 현재값의 최대값을 갱신
            current = Math.max(numbers[i], current + numbers[i]);
            max = Math.max(max, current);
        }

        return max;
    }
}
