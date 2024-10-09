import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int result = 0;
        
        while(number > 0){
            // 5개씩 먼저 담는다.
            if(number % 5 == 0){
                result += number / 5;
                break;
            }

            number -= 3;
            result++;
        }

        if(number < 0){
            System.out.println("-1");
        }else{
            System.out.println(result);
        }
    }
}