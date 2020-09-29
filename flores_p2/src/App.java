import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);

    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {

    }

    private static void displayBmiInfo(BodyMassIndex bmi) {


    }

    public static double getUserHeight() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your height in inches: ");
        double height = input.nextDouble();
        input.nextLine();
        return height;
    }
    public static double getUserWeight() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight in pounds: ");
        double weight = input.nextDouble();
        input.nextLine();
        return weight;
    }
    public static boolean moreInput() {
        System.out.print("Would you like to enter data? Please enter Y or N.");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if (choice.equals("Y")) {
            return true;
        }
        return false;
    }
}


