import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int group1 = in.nextInt(); // 첫번째 그룹 개미
        int group2 = in.nextInt(); // 두번째 그룹 개미
        in.nextLine();

        String word1 = in.nextLine();
        String word2 = in.nextLine();

        int t = in.nextInt();

        StringBuilder output = new StringBuilder(word1).reverse().append(word2);


        for(int i = 0; i < t; i++){
            for(int j = 0; j < output.length() - 1; j++){
                // 개미가 마주칠칠 경우
                if(word1.contains(String.valueOf(output.charAt(j))) 
                   && word2.contains(String.valueOf(output.charAt(j + 1)))){

                    char temp = output.charAt(j);

                    // .setCharAt(x, y) -> x 인덱스를 y문자로 바꿔줌
                    output.setCharAt(j, output.charAt(j + 1));
                    output.setCharAt(j + 1, temp);
                    j++; // 이미 교환한 부분은 건너뛰기기
                   }
                
            }
        }

        System.out.println(output.toString());
    }
}