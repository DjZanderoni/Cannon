import java.util.Scanner;

public class CannonMain {
    public static void main(String[] args) {
        System.out.println("What simulation do you want?");
        System.out.println("[1] 1 2d cannon\n[2] 2 2d cannons\n[3] 1 3d cannon\n[4] 2 3d cannons ");
        System.out.print('>');
        Scanner myObj = new Scanner(System.in);
        int option = myObj.nextInt();
        if (option == 1) TwoDimensionOneCannon.go();
        //implement once made
        if (option == 2) TwoDimensionTwoCannons.go();
        if (option == 3) ThreeDimensionOneCannon.go();
        if (option == 4) ThreeDimensionTwoCannons.go();
    }
}
