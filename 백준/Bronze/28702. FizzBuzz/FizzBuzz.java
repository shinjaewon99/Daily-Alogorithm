import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word1 = in.nextLine();
        String word2 = in.nextLine();
        String word3 = in.nextLine();

        int result = 0;
        if(isNumber(word1)) result = Integer.parseInt(word1) + 3; // 3번째로 다음 숫자
        else if(isNumber(word2)) result = Integer.parseInt(word2) + 2; // 2번째로 다음 숫자
        else result = Integer.parseInt(word3) + 1; // 1번째로 다음 숫자

        System.out.println(getResult(result));
    }

    private static boolean isNumber(String word){
        return !word.equals("Fizz") && !word.equals("Buzz") && !word.equals("FizzBuzz");
    }

    private static String getResult(int number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }
}