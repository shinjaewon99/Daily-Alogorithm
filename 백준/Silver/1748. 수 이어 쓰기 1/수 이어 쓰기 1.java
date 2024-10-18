import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int count = 0;
        int plus = 1;
        int divNum = 10;

        for(int i = 1; i <= number; i++){

            // 자릿수가 바뀌는지 확인
            if(i % divNum == 0){
                plus++;
                divNum *= 10;
            }

            count += plus;
        }

        System.out.println(count);
    }
}