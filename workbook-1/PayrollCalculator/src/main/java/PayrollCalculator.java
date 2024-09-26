import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = myscan.nextLine();
        System.out.println("Hours worked this Pay Period?");
        double hours = myscan.nextDouble();
        System.out.println("Enter payrate");
        double payrate = myscan.nextDouble();
        double grosspay = hours * payrate;
        System.out.println("Gross pay " + grosspay);


    }
}
