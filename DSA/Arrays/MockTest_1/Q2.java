class Q2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int res = s.firstUniqueChar("loveleetcode");
        System.out.println(res);
    }

}

class Solution {
    public int firstUniqueChar(String s) {
        int alpha_freq[] = new int[26];
        for(int i =0 ; i< s.length(); i++){
            alpha_freq[(int) s.charAt(i) - 97]++;
        }
        for(int i =0 ; i< s.length(); i++){
            if(alpha_freq[(int) s.charAt(i) - 97] == 1){
                return i;
            }
        }
        return -1;
    }
}