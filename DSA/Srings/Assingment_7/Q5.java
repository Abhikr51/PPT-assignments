public class Q5 {

    public static String reverse(String s, int k) {
        char str[] = s.toCharArray();
        int n = str.length;
        for (int i = 0; i < n; i += 2 * k) {
            if (i + k - 1 <= n - 1) {
                reverseK(i, i + k - 1, str);
            } else {
                reverseK(i, n - 1, str);
            }
        }
        String ans = new String(str);
        return ans;
    }

    public static void reverseK(int i, int j, char[] str) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverse(s, k));
    }
}
