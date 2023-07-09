import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input = in.nextLine();
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {

            if(ch >= 'a' && ch <= 'z'){
                output.append(String.valueOf(ch).toUpperCase());
            }else{
                output.append(String.valueOf(ch).toLowerCase());
            }
        }
        System.out.print(output.toString());
    }

}
