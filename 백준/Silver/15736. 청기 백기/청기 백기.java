import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long number = in.nextLong(); // 학생의 수 

        int result = (int) Math.sqrt(number);
        System.out.println(result);
    }
}