import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        in.nextLine();

        String word = in.nextLine();
        int result = 0;

        for(char ch : word.toCharArray()){
            result += ch - 'A' + 1;
        }

        System.out.println(result);
    }
}