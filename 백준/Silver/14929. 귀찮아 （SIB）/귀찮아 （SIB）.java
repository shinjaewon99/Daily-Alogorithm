import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] numbers = new int[n];
        int[] answers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = in.nextInt();
        }
        answers[0] = numbers[0];

        long result = 0;

        for(int i = 1; i < n; i++){
            answers[i] = answers[i - 1] + numbers[i];
        }

        for(int i = 1; i < n; i++){
            result += answers[i - 1] * numbers[i];
        }

        System.out.println(result);
    }
}
