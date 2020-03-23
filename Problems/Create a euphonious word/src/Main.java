import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String vowels = "aeiouy";
        int length = word.length();
        char[] wordMask = new char[length];

        for (int i = 0; i < length; i++) {
            wordMask[i] = vowels.contains(Character.toString(word.charAt(i))) ? '0' : '1';
        }

        int numInsertions = 0;
        int maxSequenceLength = 1;

        for (int i = 1; i < length; i++) {
            if (wordMask[i - 1] == wordMask[i]) {
                maxSequenceLength++;
            } else {
                maxSequenceLength = 1;
            }
            if (maxSequenceLength == 3) {
                numInsertions++;
                maxSequenceLength = 1;
            }
        }

        System.out.println(numInsertions);
    }
}