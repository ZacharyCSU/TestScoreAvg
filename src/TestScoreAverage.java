import java.text.DecimalFormat;

public class TestScoreAverage {
    public static void main(String[] args) {
        double testScore1 = 73.45;
        double testScore2 = 87.07;
        double testScore3 = 100;

        // Calculate the average
        double average = (testScore1 + testScore2 + testScore3) / 3;

        // DecimalFormat to format the average to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Test score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.println("The average of 3 test scores is: " + df.format(average));
    }
}