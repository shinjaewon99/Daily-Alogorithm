import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        while(t --> 0){
            int number = in.nextInt();
            int result = getResult(number);

            System.out.println(result);
        }
      
    }
    private static int getResult(int number){
        int div = 10;

        while(number >= div){
            int minusNum = number % div;

            // 현재 자릿수 제거
            number -= minusNum; 
            
            // 5보다 큰지 확인
            if(minusNum >= div / 2){
                number += div;
            }
            
            div *= 10; // 자릿수 증가
        }

        return number;
    }
}
