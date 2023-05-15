import java.util.Scanner;

public class TwoDimensionOneCannon {
    public static void go(){
        // asks and receives input for degrees
        Scanner myObj = new Scanner(System.in);
        System.out.println("Cannon Parameters:");
        System.out.println("What angle in degrees to fire at?");
        System.out.print(">");
        //reads the input
        double degreeNumber = myObj.nextDouble();
        System.out.println("What speed in meters per second?");
        System.out.print(">");
        double velocityNumber = myObj.nextDouble();
        //temporary
        //System.out.println(Math.cos(angleInputNumber));
        //System.out.println(Math.sin(angleInputNumber));
        //turns into radians, and then components
        double angleNumber = (degreeNumber * Math.PI)/180;
        double xComponent = Math.cos(angleNumber) * velocityNumber;
        double yComponent = Math.sin(angleNumber) * velocityNumber;
        //double Q = angleInputNumber + Math.pow(velocityNumber,2);
//        System.out.println(xComponent);
//        System.out.println(yComponent);
        double a = -9.81;
        double startingPosVertical = 0;
        double root = Math.sqrt(Math.pow(yComponent,2) - (2 * startingPosVertical * a));
//        double t1 = (-1 * yComponent + root ) / a;
        double t2 = (-1 * yComponent - root ) / a;
//        System.out.println("t1 "+t1);
//        System.out.println("t2 "+t2);
        //solve for distance
        double x = xComponent * t2;

//        for( int i = 0; i < 100; i++ ) System.out.println();
//        line();
        System.out.println();
        System.out.println("The angle is "+degreeNumber+" degrees");
        System.out.println("The speed is "+velocityNumber+" meters per second");
        System.out.println("The time in air is "+t2+" seconds");
        System.out.println("The final position is ("+x+",0)");
//        System.out.println();
//        line();
        }

        //public static void line() { for( int i = 0; i < 500; i++ ) System.out.print( '#' ); System.out.println(); }
    }


