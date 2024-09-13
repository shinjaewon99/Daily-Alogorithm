import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long number = in.nextLong();

        System.out.print(sum(number));
    }

    private static int sum(final long number){
        long sum = 0;
        int result = 0;

        for(int i = 1; ; i++){
           
            // sum 변수가 number 보다 크면, 그 전의 값이 최대값임
            if(sum > number){
                break;
            }
            sum += i;
            result++;
        }

        return result - 1;
    }
}
