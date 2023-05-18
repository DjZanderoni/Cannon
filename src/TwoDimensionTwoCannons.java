import java.util.Scanner;

public class TwoDimensionTwoCannons {
    public static void go() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Cannon One Parameters:");
        System.out.println("What angle in degrees to fire at?");
        System.out.print(">");

        double degreeNumberOne = myObj.nextDouble();
        System.out.println("What speed in meters per second?");
        System.out.print(">");

        System.out.println("What change in meters horizontal from zero?");
        System.out.print(">");
        double xChangeOne = myObj.nextDouble();
        double velocityNumberOne = myObj.nextDouble();
        double angleNumberOne = (degreeNumberOne * Math.PI)/180;

        double xComponentOne = Math.cos(angleNumberOne) * velocityNumberOne;
        double yComponentOne = Math.sin(angleNumberOne) * velocityNumberOne;

        double a = -9.81;
        double startingPosVerticalOne = 0;

        double rootOne = Math.sqrt(Math.pow(yComponentOne,2) - (2 * startingPosVerticalOne * a));
        double tOne = (-1 * yComponentOne - rootOne ) / a;

        double xOne = xComponentOne * tOne;

//        Here starts the second cannon
        System.out.println("Cannon Two Parameters:");
        System.out.println("What angle in degrees to fire at?");
        System.out.print(">");

        double degreeNumberTwo = myObj.nextDouble();
        System.out.println("What speed in meters per second?");
        System.out.print(">");

        System.out.println("What change in meters horizontal from zero?");
        System.out.print(">");
        double xChangeTwo = myObj.nextDouble();
        double velocityNumberTwo = myObj.nextDouble();
        double angleNumberTwo = (degreeNumberTwo * Math.PI)/180;

        double xComponentTwo = Math.cos(angleNumberTwo) * velocityNumberTwo;
        double yComponentTwo = Math.sin(angleNumberTwo) * velocityNumberTwo;

        double startingPosVerticalTwo = 0;

        double rootTwo = Math.sqrt(Math.pow(yComponentTwo,2) - (2 * startingPosVerticalTwo * a));
        double tTwo = (-1 * yComponentTwo - rootTwo ) / a;

        double xTwo = xComponentTwo * tTwo;

        //output
        double xFinalOne = xOne + xChangeOne;
        System.out.println();
        System.out.println("Cannon One:");
        System.out.println("The angle is "+degreeNumberOne+" degrees");
        System.out.println("The speed is "+velocityNumberOne+" meters per second");
        System.out.println("The time in air is "+tOne+" seconds");
        System.out.println("The final position is ("+xFinalOne+",0)");

        double xFinalTwo = xTwo + xChangeTwo;
        System.out.println();
        System.out.println("Cannon Two:");
        System.out.println("The angle is "+degreeNumberTwo+" degrees");
        System.out.println("The speed is "+velocityNumberTwo+" meters per second");
        System.out.println("The time in air is "+tTwo+" seconds");
        System.out.println("The final position is ("+xFinalTwo+",0)");

        double dist = Math.abs(xFinalOne-xFinalTwo);
        System.out.println();
        System.out.println("Their distance is "+dist+" meters");
    }
}
