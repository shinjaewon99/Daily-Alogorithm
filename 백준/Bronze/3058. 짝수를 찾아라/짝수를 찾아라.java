import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        for (int i = 0; i < t; i++) {
            int sum = 0;      
            int min = Integer.MAX_VALUE; 

            for (int j = 0; j < 7; j++) {
                int num = in.nextInt();
                if (num % 2 == 0) {  // 짝수일 경우
                    sum += num;
                    min = Math.min(min, num); 
                }
            }

            System.out.println(sum + " " + min);
        }
    }
}
