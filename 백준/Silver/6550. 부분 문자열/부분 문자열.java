import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String[] inputString = in.nextLine().split(" ");


            int index = 0;

            // 문자 비교
            for (int i = 0; i < inputString[1].length(); i++) {
                if (inputString[0].charAt(index) == inputString[1].charAt(i)) {
                    index++;
                }

                // index가 inputString의 길이랑 같을때 break
                if (index == inputString[0].length()) {
                    break;
                }
            }

            // 같다는것은 문자가 다 포함한다는것
            if (index == inputString[0].length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
