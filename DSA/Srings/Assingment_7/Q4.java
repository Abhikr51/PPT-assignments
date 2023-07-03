public class Q4 {
    public static void swap(char c[], int i, int j) {

        i = 0;
        j = c.length - 1;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;

            i++;
            j--;
        }
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");

        for (String value : str) {
            char[] c = value.toCharArray();
            swap(c, 0, c.length);
            sb.append(c).append(" ");

        }
        return sb.toString().trim();

    }

    public static void main(String args[]) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverse(s));
    }

}
