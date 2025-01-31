import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine(); // 평문
        String key = in.nextLine(); // 암호키

        StringBuilder output = new StringBuilder();
        int index = 0;

        for(char ch : word.toCharArray()){

            if(ch == ' '){
                output.append(" ");
            }else{
                int wordOrder = ch - 'a'; // 평문 문자 순서
                int keyOrder = key.charAt(index) - 'a' + 1; // 암호키 문자 순서


                int total = wordOrder - keyOrder;

                if(total < 0){
                    total += 26; // a로 돌아감
                }

                output.append((char) (total + 'a'));

            }
            index = (index + 1) % key.length();
        }

        System.out.println(output.toString());
    }
}