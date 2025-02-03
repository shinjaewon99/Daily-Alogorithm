import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            int n = in.nextInt();
            if(n == 0) break;
            int[] numbers = new int[n];

            for(int i = 0; i < n; i++){
                numbers[i] = in.nextInt();
            }

            System.out.println(getResult(numbers));

        }
    }

    private static String getResult(int[] numbers){
        StringBuilder output = new StringBuilder();
        output.append(numbers[0]).append(" "); // 첫 번째 숫자는 무조건 출력
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) { // 이전 숫자와 다르면 추가
                output.append(numbers[i]).append(" ");
            }
        }

        output.append("$");
        return output.toString();
    }
}