package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double milesDriven;
        double gasConsumed;
        System.out.println("How many miles have you driven? ");
        milesDriven = in.nextDouble();
        System.out.println("How much gas (in gallons) have you used? ");
        gasConsumed = in.nextDouble();
        double mPG = milesDriven/gasConsumed;
        System.out.println(mPG + " miles-per-gallon");
        in.close();
    }
}
