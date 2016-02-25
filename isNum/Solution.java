public class Solution {
    public boolean isNumber(String s) {
        System.out.println(">>> " + s.length());
        int  i = 0;
        char c = s.charAt(i);
        for (; i < s.length(); i += 1, c = s.charAt(i)) {
            if (Character.isSpaceChar(c)) continue;
            System.out.println(c);
        }
        return false;
    }

    public static void main(String[] argv) {
        Solution s = new Solution();
        System.out.println(s.isNumber("0"));
        System.out.println(s.isNumber(" 0.1 "));
        System.out.println(s.isNumber("abc"));
        System.out.println(s.isNumber("1 a"));
        System.out.println(s.isNumber("2e10"));
    }
}
