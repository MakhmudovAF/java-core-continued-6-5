public class Palindrome {
    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}