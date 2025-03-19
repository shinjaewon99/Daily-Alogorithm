import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt(); 
        int d = in.nextInt();

        long leftLimit = (long) a * k + b;
        long rightLimit = (long) c * k + d;

        if (leftLimit == rightLimit) {
            System.out.println("Yes " + leftLimit);
        } else {
            System.out.println("No");
        }
    }
}
