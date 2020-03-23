import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] input = new int[len];
        input[0] = scanner.nextInt();
        int minValue = input[0];
        for (int i = 1; i < len; i++) {
            input[i] = scanner.nextInt();
            if (input[i] < minValue) {
                minValue = input[i];
            }
        }
        System.out.println(minValue);
    }
}
