import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 갯수
        in.nextLine();

        while(t --> 0){
            String word = in.nextLine();

            word = word.toLowerCase();

            String reverseWord = new StringBuilder(word).reverse().toString();

            if(word.equals(reverseWord)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}