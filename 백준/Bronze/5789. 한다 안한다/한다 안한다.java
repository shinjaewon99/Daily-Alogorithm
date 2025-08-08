import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt(); // 테스트 케이스 개수
        in.nextLine();
        
        for(int i = 0; i < t; i++){
            String word = in.nextLine();
            int length = word.length();
            
            int leftIndex = length / 2 - 1;
            int rightIndex = length / 2;

            if(word.charAt(leftIndex) == word.charAt(rightIndex)){
                System.out.println("Do-it");
            }else{
                System.out.println("Do-it-Not");
            }
            
        }
    }
}
