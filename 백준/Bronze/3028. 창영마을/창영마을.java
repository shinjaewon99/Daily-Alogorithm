import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        int first = 1; // 초기 공 위치

        for(char ch : word.toCharArray()){
            if(ch == 'A') {
                if (first == 1) first = 2;
                else if (first == 2) first = 1;
            }else if (ch == 'B') {
                if (first == 2) first = 3;
                else if (first == 3) first = 2;
            } else if (ch == 'C') {
                if (first == 1) first = 3;
                else if (first == 3) first = 1;
            }
        }

        System.out.println(first);
    }
}