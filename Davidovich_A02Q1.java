/**
 * Created by Mike Davidovich on 7/5/16.
 * Last modified  7/5/16
 */

import java.text.DecimalFormat;
import java.util.*;

public class Davidovich_A02Q1 {

    /*
     * This program asks user the x and y values of two (x,y) coordinates and
     * calcualtes the distance between the two points using the distance formula
     */

    public static void main(String[] args)
    {
        double x1, y1, x2, y2, distance;        // Initializes variables

        Scanner scan = new Scanner(System.in);

        System.out.print("What is x1? ");       // User inputs for distance formula
        x1 = scan.nextDouble();
        System.out.println();
        System.out.print("What is y1? ");
        y1 = scan.nextDouble();
        System.out.println();
        System.out.print("What is x2? ");
        x2 = scan.nextDouble();
        System.out.println();
        System.out.print("What is y2? ");
        y2 = scan.nextDouble();
        System.out.println();

        distance = Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));  // Calculation of distance

        DecimalFormat fmt = new DecimalFormat("0.#");                //  Formats output to 4 decmial places

        System.out.print("The distance is " + fmt.format(distance));
    }
}
