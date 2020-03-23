import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int length = inputString.length();
        char[] reversedChars = new char[length];
        for (int i = 0; i < length; i++) {
            reversedChars[i] = inputString.charAt(length - 1 - i);
        }
        String reversedString = String.valueOf(reversedChars);
        System.out.println(reversedString.equals(inputString) ? "yes" : "no");
    }
}
