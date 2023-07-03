import java.util.*;

public class Q5 {
    public static boolean isStobogrammatic(String num) {
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('9', '6');
        map.put('8', '8');

        int start = 0;
        int end = num.length() - 1;
        while (start <= end) {
            if (num.charAt(start) != map.getOrDefault(num.charAt(end), ' ')) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String args[]) {
        String num = "69";
        System.out.println(isStobogrammatic(num));
    }

}
