import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int l = in.nextInt();

        int count = 0;
        int number = 1;

        while(count < n){
            if(!String.valueOf(number).contains(String.valueOf(l))){
                count++;
            }

            // 다음 숫자로 진행
            number++;
        }

        System.out.println(number - 1);
    }
}