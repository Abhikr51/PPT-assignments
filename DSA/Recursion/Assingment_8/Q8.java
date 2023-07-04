/*<aside>
💡 **Question 8**

Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

- For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

**Example 1:**

**Input:** s = "ab", goal = "ba"

**Output:** true

</aside> */

public class Q8 {
    public static boolean buddyString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }

        int a[] = new int[26];
        int b[] = new int[26];

        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        for (char c : goal.toCharArray()) {
            b[c - 'a']++;
        }
        if (count > 2) {
            return false;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        if (count == 2) {
            return true;
        }

        for (int i = 0; i < 26; i++) {
            if (a[i] >= 2) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";
        System.out.println(buddyString(s, goal));
    }

}
