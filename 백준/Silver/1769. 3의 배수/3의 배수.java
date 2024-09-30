import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();
        int result = 0;

        
        while(number.length() > 1){
            int sum = 0;

            for(char num : number.toCharArray()){
                sum += num - '0';
            }

            number = String.valueOf(sum); // number를 갱신
            result++;
        }


        System.out.println(result);
        
        if(Integer.parseInt(number) % 3 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
