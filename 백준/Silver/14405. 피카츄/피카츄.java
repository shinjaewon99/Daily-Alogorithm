import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String pi = "pi";
        String ka = "ka";
        String chu = "chu";

        String word = in.nextLine();

        word = word.replace(pi, "0");
        word = word.replace(ka, "0");
        word = word.replace(chu, "0");

        word = word.replace("0", "");

        if(word.length() == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
