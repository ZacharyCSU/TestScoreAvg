import java.text.DecimalFormat;
import java.util.Scanner;

public class Tests {
    private int count;
    private double average;

    public Tests() {
        this.count = 0;
        this.average = 0.0;
    }

    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        count = 0;  // Reset count
        average = 0; // Reset average

        System.out.println("Enter test scores (-1 to quit):");

        while (scanner.hasNextDouble()) {  // Check if input is a valid number
            double score = scanner.nextDouble();
            if (score == -1) break;  // Exit loop if -1 is entered
            sum += score;
            count++;
            System.out.println("Enter test scores (-1 to quit):");
        }

        if (count > 0) {
            average = sum / count;
        } else {
            average = Double.NaN;
        }

        scanner.close(); // Close scanner to prevent input issues
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "The average of the " + count + " scores entered is " + df.format(average) + ".";
    }
}
