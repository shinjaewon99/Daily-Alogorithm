import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result1 = 1;
        int result2 = 1;
        boolean flag = false; // 홀수 판별 

        for(int i = 0 ; i < 3; i++){
            int number = in.nextInt();
            if(number % 2 != 0){
                result1 *= number;
                flag = true;
            }else{
                result2 *= number;
            }
        }

        if(flag){
            System.out.println(result1);
        }else{
            System.out.println(result2);
        }
    }
}