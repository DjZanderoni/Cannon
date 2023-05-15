import java.util.Scanner;

public class Scratch {
    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Cannon Two Parameters:");
//        System.out.println("What angle in degrees to fire at?");
//        System.out.print(">");
//
//        double degreeNumberTwo = myObj.nextDouble();
//        System.out.println("What speed in meters per second?");
//        System.out.print(">");
//
//        double velocityNumberTwo = myObj.nextDouble();
//        double angleNumberTwo = (degreeNumberTwo * Math.PI)/180;
//
//        double xComponentTwo = Math.cos(angleNumberTwo) * velocityNumberTwo;
//        double yComponentTwo = Math.sin(angleNumberTwo) * velocityNumberTwo;
//
//        double a = -9.81;
//        double startingPosVerticalTwo = 0;
//
//        double rootTwo = Math.sqrt(Math.pow(yComponentTwo,2) - (2 * startingPosVerticalTwo * a));
//        double tTwo = (-1 * yComponentTwo - rootTwo ) / a;
//
//        double xTwo = xComponentTwo * tTwo;
//
//        System.out.println();
//        System.out.println("The angle is "+degreeNumberTwo+" degrees");
//        System.out.println("The speed is "+velocityNumberTwo+" meters per second");
//        System.out.println("The time in air is "+tTwo+" seconds");
//        System.out.println("The final position is ("+xTwo+",0)");




        Scanner myObj = new Scanner(System.in);
//        instructions for 3d cannon
//        System.out.println("This is a diagram of the system for the cannon");
//        System.out.println("\t   | +z 90° on yz\n" +
//                "\t   |\n" +
//                "\t   |\n" +
//                "\t   |\n" +
//                "\t   |__________ +y 0° on yz, 0° on xy\n" +
//                "\t  /\n" +
//                "     /\n" +
//                "    /\n" +
//                "   / +x 270° on xy");
//        System.out.println("Coordinates will be in (x,y,z)");




        System.out.println("Cannon Two Parameters:");
        System.out.println("What angle in degrees to fire at? (yz)");
        System.out.print(">");

        double yzDegreeNumberTwo = myObj.nextDouble();
        System.out.println("What angle in degrees to fire at? (xy)");
        System.out.print(">");

        double yxDegreeNumberTwo = myObj.nextDouble();
        System.out.println("What speed in meters per second?");
        System.out.print(">");

        double velocityNumberTwo = myObj.nextDouble();
        double yzAngleNumberTwo = (yzDegreeNumberTwo * Math.PI)/180;
        double yxAngleNumberTwo = (yxDegreeNumberTwo * Math.PI)/180;

        double zComponentTwo = Math.sin(yzAngleNumberTwo) * velocityNumberTwo;
        double yxVelocityTwo = Math.cos(yzAngleNumberTwo) * velocityNumberTwo;
        double xComponentTwo = Math.sin(yxAngleNumberTwo) * yxVelocityTwo * -1;
        double yComponentTwo = Math.cos(yxAngleNumberTwo) * yxVelocityTwo;

        double a = -9.81;
        double startingPosVerticalTwo = 0;

        double rootTwo = Math.sqrt(Math.pow(zComponentTwo,2) - (2 * startingPosVerticalTwo * a));
        double tTwo = (-1 * zComponentTwo - rootTwo ) / a;
        System.out.println();
        System.out.println("Cannon Two:");
        System.out.println("yz angle is "+yzDegreeNumberTwo);
        System.out.println("yx angle is "+yxDegreeNumberTwo);
        System.out.println("The speed is "+velocityNumberTwo);
        System.out.println("Time in air is "+tTwo);
        double xTwo = xComponentTwo * tTwo;
        double yTwo = yComponentTwo * tTwo;
        double zTwo = 0;
        System.out.println("("+xTwo+","+yTwo+","+zTwo+")");
    }

}
