import javax.sound.sampled.Line;
import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        // establishing scanner object
        Scanner scan = new Scanner(System.in);

        // welcome the user, take their coordinates
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String pair1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String pair2 = scan.nextLine();
        System.out.println();

        // extract coordinates from coordinate pairs (FIX THIS AND YOU'RE DONE)
        int x1 = Integer.parseInt(pair1.substring(1, 2));
        int y1 = Integer.parseInt(pair1.substring(4, 5));
        int x2 = Integer.parseInt(pair2.substring(1, 2));
        int y2 = Integer.parseInt(pair2.substring(4, 5));

        // if line is vertical, inform user and end program
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(0);
        }

        // otherwise, create a Linear Equation object from these values, and print line info
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println(equation.lineInfo());
        System.out.println();

        // takes a value for x and prints its corresponding point on the line
        System.out.print("Enter a value for x: ");
        double x = scan.nextDouble();
        scan.nextLine();
        System.out.println();
        System.out.println("The point on the line is " + equation.coordinateForX(x));
    }
}
