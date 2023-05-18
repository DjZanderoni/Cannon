import java.util.Scanner;

public class ThreeDimensionOneCannon {
    public static void go() {

        Scanner myObj = new Scanner(System.in);
//        instructions for 3d cannon
        System.out.println("This is a diagram of the system for the cannon");
        System.out.println("\t   | +z 90° on yz\n" +
                "\t   |\n" +
                "\t   |\n" +
                "\t   |\n" +
                "\t   |__________ +y 0° on yz, 0° on xy\n" +
                "\t  /\n" +
                "     /\n" +
                "    /\n" +
                "   / +x 270° on xy");
        System.out.println("Coordinates will be in (x,y,z)");




        System.out.println("Cannon Parameters:");
        System.out.println("What angle in degrees to fire at? (yz)");
        System.out.print(">");

        double yzDegreeNumberOne = myObj.nextDouble();
        System.out.println("What angle in degrees to fire at? (xy)");
        System.out.print(">");

        double yxDegreeNumberOne = myObj.nextDouble();
        System.out.println("What speed in meters per second?");
        System.out.print(">");

        double velocityNumberOne = myObj.nextDouble();
        System.out.println("What x change in meters?");
        System.out.print(">");

        double xChange = myObj.nextDouble();
        System.out.println("What y change in meters?");
        System.out.print(">");

        double yChange = myObj.nextDouble();
        double yzAngleNumberOne = (yzDegreeNumberOne * Math.PI)/180;
        double yxAngleNumberOne = (yxDegreeNumberOne * Math.PI)/180;

        double zComponentOne = Math.sin(yzAngleNumberOne) * velocityNumberOne;
        double yxVelocityOne = Math.cos(yzAngleNumberOne) * velocityNumberOne;
        double xComponentOne = Math.sin(yxAngleNumberOne) * yxVelocityOne * -1;
        double yComponentOne = Math.cos(yxAngleNumberOne) * yxVelocityOne;

        double a = -9.81;
        double startingPosVerticalOne = 0;

//        System.out.println(xComponentOne);
//        System.out.println(yComponentOne);
//        System.out.println(zComponentOne);
//        System.out.println("("+xComponentOne+","+yComponentOne+","+zComponentOne+")");

        double rootOne = Math.sqrt(Math.pow(zComponentOne,2) - (2 * startingPosVerticalOne * a));
        double tOne = (-1 * zComponentOne - rootOne ) / a;
        System.out.println();

//        double xOne = xComponentOne * tOne;
        System.out.println("yz angle is "+yzDegreeNumberOne);
        System.out.println("yx angle is "+yxDegreeNumberOne);
        System.out.println("The speed is "+velocityNumberOne);
        System.out.println("Time in air is "+tOne);
        double xOne = (xComponentOne * tOne) + xChange;
        double yOne = (yComponentOne * tOne) + yChange;
        double zOne = 0;
        System.out.println("("+xOne+","+yOne+","+zOne+")");

    }
}
