import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int p = in.nextInt();
        Map<Integer, Integer> store = new HashMap<>();

        int current = a;
        int index = 0;

        while(!store.containsKey(current)){
            store.put(current, index);
            current = calcuNum(current, p);
            index++;
        }

        int result = store.get(current); // 마지막으로 담긴 current의 index를 구함
        System.out.println(result);
    }

    // 현재수의 다음수를 구하는 메소드
    private static int calcuNum(int num1, int num2){
        int result = 0;

        while(num1 > 0){
            int div = num1 % 10;
            result += Math.pow(div, num2);
            num1 /= 10;
        }
        return result;
    }
}