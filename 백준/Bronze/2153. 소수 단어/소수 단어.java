import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        int sum = 0;
        
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) { 
                sum += ch - 'a' + 1;
            } else if (Character.isUpperCase(ch)) {
                sum += ch - 'A' + 27;
            }
        }

        if(isPrime(sum)){
            System.out.println("It is a prime word.");
        }else{
            System.out.println("It is not a prime word.");
        }
    }

    private static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }

        return true;
    }
}