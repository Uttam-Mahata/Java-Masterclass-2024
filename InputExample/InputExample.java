import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
        double age = input.nextDouble();

        System.out.println("Enter your maximum heart rate: ");
        double maxHeartRate = input.nextDouble();

        double fb = (maxHeartRate - age) * 0.65;
        System.out.println("Your ideal fat-burning heart rate is " + fb + " beats per minute.");
        
        input.close();
    }
}