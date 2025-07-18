import java.util.*;

public class duplicate_parenthesis {
    public static boolean check(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing bracket
            if (ch == ')') {
                int count = 0;

                // check if any characters between the brackets
                while (!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // duplicate found: e.g. ()
                }

                if (!s.isEmpty()) {
                    s.pop(); // pop the opening '('
                }
            } else {
                s.push(ch);
            }
        }

        return false; // no duplicate found
    }

    public static void main(String[] args) {
        System.out.println(check("((a+b))")); // true → duplicate
        System.out.println(check("(a+(b)/c)")); // false → valid
        System.out.println(check("(a+b*(c-d))")); // false → valid
        System.out.println(check("((a))")); // true → duplicate
        System.out.println(check("()")); // true → duplicate
    }
}
