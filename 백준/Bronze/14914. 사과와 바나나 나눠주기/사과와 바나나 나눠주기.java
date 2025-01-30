import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(); // 사과의 갯수
        int b = in.nextInt(); // 바나의 갯수

        int number = gcd(a, b);

        for(int i = 1; i <= number; i++){
            if(number % i == 0){ // 약수 이면
                int person = i;
                int apple = a / i;
                int banana = b / i;

                System.out.println(person + " " + apple + " " + banana);
            }
        }
        
    }

    private static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}