import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // 환전한 금액
        int m = in.nextInt(); // 묶음의 크기 

        int total = 0;

        while(n > 0){
            total += n;
            n /= m; 
        }

        System.out.println(total);
    }
}
