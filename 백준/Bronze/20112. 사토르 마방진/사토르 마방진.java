import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();
        
        char[][] words = new char[n][n];

        boolean flag = true;
        
        for (int i = 0; i < n; i++) {
            String word = in.nextLine();
            for (int j = 0; j < n; j++) {
                words[i][j] = word.charAt(j);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!(words[i][j] == words[j][i])){
                    flag = false;
                    break;
                }
            }
        }

        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}