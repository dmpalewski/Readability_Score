import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCompanies = scanner.nextInt();

        int[] incomes = new int[numCompanies];
        double[] taxRates = new double[numCompanies];
        double[] taxSizes = new double[numCompanies];
        double maxTaxSize = Double.MIN_VALUE;
        int maxTaxPayerNumber = 1;

        for (int i = 0; i < numCompanies; i++) {
            incomes[i] = scanner.nextInt();
        }

        for (int i = 0; i < numCompanies; i++) {
            taxRates[i] = scanner.nextDouble() / 100;
            taxSizes[i] = incomes[i] * taxRates[i];
            if (taxSizes[i] > maxTaxSize) {
                maxTaxSize = taxSizes[i];
                maxTaxPayerNumber = i + 1;
            }
        }

        System.out.println(maxTaxPayerNumber);
    }
}
