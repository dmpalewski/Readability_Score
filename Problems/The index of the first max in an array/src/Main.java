import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] input = new int[len];
        input[0] = scanner.nextInt();
        int maxValue = input[0];
        int maxValueInd = 0;
        for (int i = 1; i < len; i++) {
            input[i] = scanner.nextInt();
            if (input[i] > maxValue) {
                maxValue = input[i];
                maxValueInd = i;
            }
        }
        System.out.println(maxValueInd);
    }
}
