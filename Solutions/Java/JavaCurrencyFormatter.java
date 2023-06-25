import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat numberFormatUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatIn = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));

        numberFormatUs.setMaximumFractionDigits(2);
        numberFormatIn.setMaximumFractionDigits(2);
        numberFormatChina.setMaximumFractionDigits(2);
        numberFormatFrance.setMaximumFractionDigits(2);

        String us = numberFormatUs.format(payment);
        String india = numberFormatIn.format(payment);
        String china = numberFormatChina.format(payment);
        String france = numberFormatFrance.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
