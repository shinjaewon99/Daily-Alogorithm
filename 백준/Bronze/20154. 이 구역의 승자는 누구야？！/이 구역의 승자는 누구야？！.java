import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] alpha = new int[]{3, 2, 1, 2, 3, 3, 3, 3, 1, 1, 3, 1, 3, 3, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1};
        String input = in.nextLine();
        int sum = 0; // 누적합을 위한 sum 변수
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            sum += alpha[ch - 'A']; // 알파벳에 맞는 숫자를 누적하여 더해준다.
        }
        if(sum % 2 == 0){
            System.out.println("You're the winner?");
        }else{
            System.out.println("I'm a winner!");
        }
    }
}
