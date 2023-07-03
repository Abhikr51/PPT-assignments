public class Q3 {

    public static String sum(String num1, String num2) {
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int a = i < 0 ? 0 : num1.charAt(i) - '0';
            int b = j < 0 ? 0 : num2.charAt(j) - '0';

            int sum = (a + b + carry);
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return (carry == 1 ? sb.append('1') : sb).reverse().toString();
    }

    public static void main(String args[]) {
        String num1 = "11";
        String num2 = "123";

        System.out.println(sum(num1, num2));
    }

}
