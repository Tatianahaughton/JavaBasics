package interviewPrep;

public class StringMethod {
    public static void main(String[] args) {
        StringMethod obj = new StringMethod();
        obj.isBalanced("())");
    }

    public boolean isBalanced(String s) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                count++;
                sum += count;
                if (sum % 2 == 0) {
                    return true;
                }
            } else {
            }
            }

                return false;
            }
        }







