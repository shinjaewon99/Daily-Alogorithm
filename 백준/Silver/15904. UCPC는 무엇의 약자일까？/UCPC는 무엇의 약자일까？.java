import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        char[] uc = {'U', 'C', 'P', 'C'};
        int index = 0;

        for(int i = 0; i < word.length(); i++){
            if(uc[index] == word.charAt(i)){
                index++;
            }
            if(index == 4){
                System.out.println("I love UCPC");
                return;
            }
        }
            System.out.println("I hate UCPC");
    }
}
