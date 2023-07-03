public class Q2 {
    public static void main(String[] args) {
        int i = 1, n = 10, first = 0, second = 1;
        System.out.println("Fib series of " + n + " terms:");
        while (i <= n) {
            System.out.print(first + ", ");

            int nextTerm = first + second;
            first = second;
            second = nextTerm;

            i++;
        }
    }
}