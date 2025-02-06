import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수

        while(t --> 0){
            int number = in.nextInt();
            int compare = number * number;

            if(String.valueOf(compare).endsWith(String.valueOf(number))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}