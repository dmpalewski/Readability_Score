import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();
        int length = s.length();
        String result = n > length ? s : s.substring(n, length) + s.substring(0, n);
        System.out.println(result);
    }
}
