import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String result = "Good";
        String[] input = in.nextLine().split(" ");
        for (int i = 0; i < input.length - 1; i++) {
            int firstNumber = Integer.parseInt(input[i]);
            int secondNumber = Integer.parseInt(input[i + 1]);

            // 앞에있는 숫자가 뒤에있는 숫자보다 큰 경우
            if(firstNumber > secondNumber){
                result = "Bad";
                break;
            }
        }
        
        System.out.println(result);
    }
}