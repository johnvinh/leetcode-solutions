public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        System.out.println(sb);
        return Integer.parseInt(sb.reverse().toString()) == x;
    }
}
