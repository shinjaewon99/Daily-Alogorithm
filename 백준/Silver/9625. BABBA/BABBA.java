import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int[] fiboA = new int[46];
        int[] fiboB = new int[46];

        fiboA[0] = 1; // number가 0일때는 A의 갯수는 1개
        fiboB[0] = 0;
        fiboA[1] = 0;
        fiboB[1] = 1;

        for(int i = 2; i < 46; i++){
            fiboA[i] = fiboA[i - 1] + fiboA[i - 2];
            fiboB[i] = fiboB[i - 1] + fiboB[i - 2];
        }

        System.out.println(fiboA[number] + " " + fiboB[number]);
        
    }
}
