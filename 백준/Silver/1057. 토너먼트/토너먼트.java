import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int kim = in.nextInt();
        int lim = in.nextInt();

        int count = 0;

        // 지민 8 -> 4 -> 2 -> 1
        // 한수 9 -> 5 -> 3 -> 2
        while(kim != lim){
            kim = kim / 2 + kim % 2;
            lim = lim / 2 + lim % 2;
            count++;         
        }

        System.out.println(count);
    }
}