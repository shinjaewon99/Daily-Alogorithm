import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int number = in.nextInt();
            int standNumber = 1;
            int result = 1;

            // 1, 11, 111로 증가하면서 나누어지는지 확인
            while(standNumber % number != 0){
                standNumber = (standNumber * 10 + 1) % number;
                result++;
            }

            System.out.println(result);
        }
        
        
    }
}