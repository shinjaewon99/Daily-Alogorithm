import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] words = in.nextLine().split(" ");
        String word1 = words[0];
        String word2 = words[1];

        int find1= 0;
        int find2 = 0;
        boolean flag = false;
        
        for(int i = 0; i < word1.length(); i++){
            for(int j = 0; j < word2.length(); j++){
                
                // 교차되는 구간
                if(word1.charAt(i) == word2.charAt(j)){
                    find1 = i;
                    find2 = j;

                    flag = true;
                    break;
                }
            }

            // 바깥쪽 loop도 탈출
            if(flag) break;
        }
        
        for(int i = 0; i < word2.length(); i++){
            for(int j = 0; j < word1.length(); j++){
                if(i == find2){
                    System.out.print(word1.charAt(j));
                }else if(j == find1){
                    System.out.print(word2.charAt(i));
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        

    }
}