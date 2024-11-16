import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt(); // 골라야 하는 수

        Integer[] numbers = new Integer[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        int result = 0;

        for(int i = 0; i< k; i++){
            result += numbers[i] - i;
        }

        System.out.println(result);
    }
}