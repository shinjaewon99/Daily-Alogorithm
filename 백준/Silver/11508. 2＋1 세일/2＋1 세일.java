import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers);
        int result = 0;

        for(int i = n - 1; i >= 0; i -= 3){
            result += numbers[i]; // 첫번째 값 더하기

            // 두번째 값 더하기
            if(i - 1 >= 0) {
                result += numbers[i - 1];
            }
        }

        System.out.println(result);
    }
}
