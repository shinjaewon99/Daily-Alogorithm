import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sungmin = in.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < sungmin.length(); i++) {
            boolean check = Character.isDigit(sungmin.charAt(i)); // 숫자로 이루어진 문자열중 숫자 검증
            
            // 숫자가 아니라면 StringBuilder에 누적 해준다.
            if(!check){
                output.append(sungmin.charAt(i));
            }
        }

        String compare = in.nextLine();
        // 문자열과 키워드가 연속된 문자인지 비교
        if(output.toString().contains(compare)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }


    }

}
