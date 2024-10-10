import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        StringBuilder output = new StringBuilder();
        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < size; i++) {
            String compare = in.next();

            switch (compare) {
                case "push":
                    int number = in.nextInt();
                    stack.push(number);
                    break;
                case "pop":
                    if (!stack.isEmpty()) {
                        output.append(stack.pop()).append("\n");
                    } else {
                        output.append("-1\n");
                    }
                    break;
                case "size":
                    output.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (!stack.isEmpty()) {
                        output.append("0\n");
                    } else {
                        output.append("1\n");
                    }
                    break;
                case "top":
                    if (!stack.isEmpty()) {
                        output.append(stack.peek()).append("\n");
                    } else {
                        output.append("-1\n");
                    }
                    break;
            }
        }
        System.out.println(output.toString());
    }
}
