public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        System.out.println(sb);
        return sb.reverse().toString().equals(String.valueOf(x));
    }
}
