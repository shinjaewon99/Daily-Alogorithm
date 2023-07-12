import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(true){
            String input = in.nextLine();
            StringBuilder output = new StringBuilder();
            // 탈출 조건
            if(input.equals("END")) break;
            output.append(input);
            System.out.println(output.reverse().toString());

        }
    }
}
