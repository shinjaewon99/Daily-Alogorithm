public class Main {
    public static void main(String[] args) {
        boolean[] store = new boolean[10001];

        for(int i = 1; i < 10001; i++){
            int num = selfNum(i);

            if(num <= 10000) {
                store[num] = true;
            }
        }

         for (int i = 1; i <= 10000; i++) {
            if (!store[i]) {
                System.out.println(i);
            }
        }
    }

    private static int selfNum(int number) {
        int sum = number;

        while(number != 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
