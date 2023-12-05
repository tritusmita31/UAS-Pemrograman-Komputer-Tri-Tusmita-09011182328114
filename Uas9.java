import java.util.Stack;
public class Uas9 {
    public static boolean checkParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "((2 + 3) * 5)";
        String expression2 = "((2 + 3) * 5";
        String expression3 = "((2 + 3) * 5))";

        System.out.println("Expression 1: " + checkParentheses(expression1));
        System.out.println("Expression 2: " + checkParentheses(expression2));
        System.out.println("Expression 3: " + checkParentheses(expression3));
    }
}
