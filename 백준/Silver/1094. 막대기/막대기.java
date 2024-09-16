import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int compare = 64;
        int result = 0;
        
        while(number > 0) {

            // 가지고있는 막대기를 반 나눈다.
            if(compare > number){
                compare /= 2;
            }
            // 
            else{
                number -= compare;
                result++;
            }
        }

        System.out.println(result);
    }
}
