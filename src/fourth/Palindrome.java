package fourth;

public class Palindrome {
    public boolean isPalindromeLine(String str) {
        String lowerCaseStr = str.toLowerCase().trim();
        StringBuilder processedString = new StringBuilder(lowerCaseStr);

        while (processedString.indexOf(" ") != -1) {
            processedString.deleteCharAt(processedString.indexOf(" "));
        }

        StringBuilder reversedProcessedString = new StringBuilder(processedString);
        reversedProcessedString.reverse();

        return processedString.toString().equals(reversedProcessedString.toString());
    }
}