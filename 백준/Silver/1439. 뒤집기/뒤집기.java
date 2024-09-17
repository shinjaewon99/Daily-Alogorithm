import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();

        char word = number.charAt(0);

        int count0 = 0;
        int count1 = 0;

        if(word == '0'){
            count0++;
        }else{
            count1++;
        }

        for(int i = 1; i < number.length(); i++){

            if(number.charAt(i) != word){
                if(number.charAt(i) == '0'){
                    count0++;
                }else{
                    count1++;
                }

                // 이전 문자를 갱신
                word = number.charAt(i);
            }
        }

        System.out.println(Math.min(count0, count1));
    }
}
