import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i< n; i++){
            numbers[i] = in.nextInt();
        }

        int count = 0;

        for(int i = numbers.length - 1; i >= 0; i--){

            if(numbers[i] <= k){
                count += k / numbers[i];
                k = k % numbers[i];
            }
        }

        System.out.println(count);
    }
}