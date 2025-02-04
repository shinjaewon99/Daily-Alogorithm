import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();
        String[] words = word.split("");

        StringBuilder output1 = new StringBuilder();
        StringBuilder output2 = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            output1.append(words[i]);
        }

        for(int i = words.length - 1; i >= 0; i--){
            output2.append(words[i]);
        }

        if(output1.toString().equals(output2.toString())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}