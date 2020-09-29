public class BodyMassIndex {

    public BodyMassIndex(double height, double weight) {
        double bmi = (703 * weight)/(height * height);
        System.out.printf("Your BMI is: %.1f%n", bmi);
    }

    public void bmiCategories(double height, double weight) {
        double bmi = (703 * weight)/(height * height);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9 ) {
            System.out.println("Normal weight");
        }
        else if (bmi >= 25 && bmi <= 29.9 ) {
            System.out.println("Overweight");
        }
        else if (bmi >= 30) {
            System.out.println("Obesity");
        }
    }
}







