package fourth;

public class Palindrome {
    public boolean isPalindromeLine(String str) {
        String lowerCaseStr = str.toLowerCase().trim();

        StringBuilder processedString = new StringBuilder(lowerCaseStr);
        int i = 0;
        while (i < processedString.length()) {
            if (processedString.charAt(i) == ' ') {
                processedString.deleteCharAt(i);
            } else {
                i++;
            }
        }

        StringBuilder reversedProcessedString = new StringBuilder(processedString);
        reversedProcessedString.reverse();

        return processedString.toString().equals(reversedProcessedString.toString());
    }
}