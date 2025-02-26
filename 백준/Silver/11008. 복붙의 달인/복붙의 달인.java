import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();
        
        while(t --> 0){
            int count = 0;
            String word = in.next();
            String target = in.next();

            word = word.replace(target, "a");

            System.out.println(count + word.length());
        }

    }
}