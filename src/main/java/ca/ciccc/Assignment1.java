package ca.ciccc;

import java.math.RoundingMode;
import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Assignment1 {

    /**
     * Write a function to convert temperature from Fahrenheit to Celsius degree
     * Sample Input : 212
     *
     * @param degree
     * @return "212.0 degree Fahrenheit is equal to 100.0 in Celsius"
     */
    public static String fahrenheitToCelsius(double degree) {

        double celsius = (degree - 32) * ((double) 5 / 9);
        String result = String.format(Locale.CANADA, "%.1f degree Fahrenheit is equal to %.1f in Celsius", degree, celsius);

        return result;
    }

    /**
     * Write a function program that takes an integer in inches, converts in to meters.
     * Sample Input : 1000
     *
     * @param inches
     * @return "1000.0 inches is 25.4 meters"
     */
    public static String inchesToMeters(int inches) {
        float meters = 0.0254f * inches;
        return String.format(Locale.CANADA, "%.1f inches is %.1f meters", Integer.valueOf(inches).floatValue(), meters);
    }

    /**
     * Write a function that takes an integer between 0 and 1000 and adds all the digits.
     * Sample Input : 565
     *
     * @param number
     * @return "The sum of all digits in 565 is 16"
     */
    public static String addDigits(int number) {
        int sum = 0;
        int dividend = number;
        while (dividend > 0) {
            int remainder = dividend % 10;
            sum += remainder;
            dividend /= 10;
        }
        return String.format(Locale.CANADA, "The sum of all digits in 565 is 16", number, sum);
    }

    /**
     * Write a function that takes an integer as minutes and convert it to years and days.
     * Sample Input : 3456789
     *
     * @param mins
     * @return "3456789 minutes is approximately 6 years and 210 days"
     */
    public static String minsToYearsDays(int mins) {
        int years = mins / 60 / 24 / 365;
        int days = (mins / 60 / 24) % 365;

        return String.format(Locale.CANADA, "%d minutes is approximately %d years and %d days", mins, years, days);
    }

    /**
     * Write a function that takes weight as Kgs(Kilograms) and height as meters and compute
     * body mass index (BMI)
     * Sample Input: kgs = 70, meters = 1.75
     *
     * @param kgs
     * @param meters
     * @return "Body Mass Index is 22.857"
     */
    public static String bmi(int kgs, double meters) {
//        Formula: weight (kg) / [height (m)]2
        double bmi = kgs / Math.pow(meters, 2);
        return String.format(Locale.CANADA, "Body Mass Index is %.3f", bmi);
    }

    /**
     * Write a function that takes a distance (in meters) and the time was taken
     * (as three numbers: hours, minutes, seconds), and display the speed, in meters
     * per second, kilometers per hour and miles per hour
     * (hint: 1 mile = 1609 meters).
     * Sample Input :
     * meters = 2500
     * hours = 5
     * minutes = 56
     * seconds = 23
     *
     * @param meters
     * @param hours
     * @param minutes
     * @param seconds
     * @return "Your speed in meters/second is 0.1169
     * Your speed in km/h is 0.4208
     * Your speed in miles/h is 0.2615"
     */
    public static String speed(int meters, int hours, int minutes, int seconds) {
        int amountSec = (hours * 60 * 60 + minutes * 60 + seconds);
        double ms = (double) meters / amountSec;
        double totalHours = (double) amountSec / 60 / 60;
        double km = (double) meters / 1000;
        double kh = (double) km / totalHours;
        double miles = (double) meters / 1609;
        double mh = (double) miles / totalHours;
        NumberFormat formatter = getNumberFormat();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.CANADA, "Your speed in meters/second is %s", formatter.format(ms)));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Your speed in km/h is %s", formatter.format(kh)));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Your speed in miles/h is %s", formatter.format(mh)));
        return sb.toString();
    }

    private static NumberFormat getNumberFormat() {
        NumberFormat formatter = DecimalFormat.getInstance(Locale.CANADA);
        if (formatter instanceof DecimalFormat) {
            formatter.setMaximumFractionDigits(4);
            formatter.setMinimumFractionDigits(4);
            formatter.setRoundingMode(RoundingMode.FLOOR);
        }
        return formatter;
    }

    /**
     * Write a function that reads a number and display the square,
     * cube, and the fourth power.
     * Sample Input :
     * number = 5
     *
     * @param number
     * @return "Square: 25
     * Cube: 125
     * Fourth power: 625"
     */
    public static String powers(int number) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.CANADA, "Square: %d", (int) Math.pow(number, 2)));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Cube: %d", (int) Math.pow(number, 3)));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Fourth power: %d", (int) Math.pow(number, 4)));
        return sb.toString();
    }

    /**
     * Write a function that takes two integers a and b, then prints the sum,
     * the difference, the product, the average, the distance (absolute value of
     * the difference), the maximum, and the minimum between the two.
     * Sample Input :
     * a = 25
     * b = 5
     *
     * @param a
     * @param b
     * @return "Sum of two integers: 30
     * Difference of two integers: 20
     * Product of two integers: 125
     * Average of two integers: 15.00
     * Distance of two integers: 20
     * Max integer: 25
     * Min integer: 5"
     */
    public static String arithmetic(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.CANADA, "Sum of two integers: %d", a + b));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Difference of two integers: %d", a - b));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Product of two integers: %d", a * b));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Average of two integers: %.2f", (float) (a + b) / 2));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Distance of two integers: %d", Math.abs(a - b)));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Max integer: %d", Math.max(a, b)));
        sb.append("\n");
        sb.append(String.format(Locale.CANADA, "Min integer: %d", Math.min(a, b)));
        return sb.toString();
    }
}
