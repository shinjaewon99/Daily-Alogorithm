import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = in.nextLine();

        // 크로아티아 문자를 1로 replace
        for(String alp : alpha){
            word = word.replace(alp, "1");
        }

        System.out.println(word.length());

    }
}