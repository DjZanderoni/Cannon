import java.util.Scanner;

public class ThreeDimensionTwoCannons {
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




        System.out.println("Cannon One Parameters:");
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

        double xChangeOne = myObj.nextDouble();
        System.out.println("What y change in meters?");
        System.out.print(">");

        double yChangeOne = myObj.nextDouble();
        double yzAngleNumberOne = (yzDegreeNumberOne * Math.PI)/180;
        double yxAngleNumberOne = (yxDegreeNumberOne * Math.PI)/180;

        double zComponentOne = Math.sin(yzAngleNumberOne) * velocityNumberOne;
        double yxVelocityOne = Math.cos(yzAngleNumberOne) * velocityNumberOne;
        double xComponentOne = Math.sin(yxAngleNumberOne) * yxVelocityOne * -1;
        double yComponentOne = Math.cos(yxAngleNumberOne) * yxVelocityOne;

        double a = -9.81;
        double startingPosVerticalOne = 0;


        double rootOne = Math.sqrt(Math.pow(zComponentOne,2) - (2 * startingPosVerticalOne * a));
        double tOne = (-1 * zComponentOne - rootOne ) / a;
//        System.out.println();
//        System.out.println("Cannon One:");
//        System.out.println("yz angle is "+yzDegreeNumberOne);
//        System.out.println("yx angle is "+yxDegreeNumberOne);
//        System.out.println("The speed is "+velocityNumberOne);
//        System.out.println("Time in air is "+tOne);
//        double xOne = xComponentOne * tOne;
//        double yOne = yComponentOne * tOne;
//        double zOne = 0;
//        System.out.println("("+xOne+","+yOne+","+zOne+")");





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
        System.out.println("What x change in meters?");
        System.out.print(">");

        double xChangeTwo = myObj.nextDouble();
        System.out.println("What y change in meters?");
        System.out.print(">");

        double yChangeTwo = myObj.nextDouble();
        double yzAngleNumberTwo = (yzDegreeNumberTwo * Math.PI)/180;
        double yxAngleNumberTwo = (yxDegreeNumberTwo * Math.PI)/180;

        double zComponentTwo = Math.sin(yzAngleNumberTwo) * velocityNumberTwo;
        double yxVelocityTwo = Math.cos(yzAngleNumberTwo) * velocityNumberTwo;
        double xComponentTwo = Math.sin(yxAngleNumberTwo) * yxVelocityTwo * -1;
        double yComponentTwo = Math.cos(yxAngleNumberTwo) * yxVelocityTwo;

//        double a = -9.81;
        double startingPosVerticalTwo = 0;

        double rootTwo = Math.sqrt(Math.pow(zComponentTwo,2) - (2 * startingPosVerticalTwo * a));
        double tTwo = (-1 * zComponentTwo - rootTwo ) / a;


        System.out.println();
        System.out.println("Cannon One:");
        System.out.println("yz angle is "+yzDegreeNumberOne);
        System.out.println("yx angle is "+yxDegreeNumberOne);
        System.out.println("The speed is "+velocityNumberOne);
        System.out.println("Time in air is "+tOne);
        double xOne = (xComponentOne * tOne) + xChangeOne;
        double yOne = (yComponentOne * tOne) + yChangeOne;
        double zOne = 0;
        System.out.println("("+xOne+","+yOne+","+zOne+")");
        System.out.println();
        System.out.println("Cannon Two:");
        System.out.println("yz angle is "+yzDegreeNumberTwo);
        System.out.println("yx angle is "+yxDegreeNumberTwo);
        System.out.println("The speed is "+velocityNumberTwo);
        System.out.println("Time in air is "+tTwo);
        double xTwo = (xComponentTwo * tTwo)+ xChangeTwo;
        double yTwo = (yComponentTwo * tTwo)+ yChangeTwo;
        double zTwo = 0;
        System.out.println("("+xTwo+","+yTwo+","+zTwo+")");
        double dist = Math.sqrt(Math.pow(xTwo-xOne,2)+Math.pow(yTwo-yOne,2));
        System.out.println("Their distance is "+dist);
    }
}
