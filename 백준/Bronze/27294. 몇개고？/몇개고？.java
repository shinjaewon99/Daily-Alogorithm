import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); 
        int s = in.nextInt(); 
        
        int result = 0;

        if (t >= 12 && t <= 16 && s == 0) {
            result = 320;
        } else {
            result = 280;
        }

        System.out.println(result);
    }
}