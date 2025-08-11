import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        in.nextLine();
        String[] words = new String[t];

        for(int i = 0; i < t; i++){
            words[i] = in.nextLine();
        }

        for(String word : words){
            if(word.length() >= 6 && word.length() <= 9){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}