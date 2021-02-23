import java.util.Scanner;
public class FanGeometry {


    public double length(){
        Scanner scnr = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double pointslength;

        pointslength = 0.0;
        System.out.println("enter x1 value");
        x1 = scnr.nextDouble();
        System.out.println("enter y1 value");
        y1 = scnr.nextDouble();
        System.out.println("enter x2 value");
        x2 = scnr.nextDouble();
        System.out.println("enter y2 value");
        y2 = scnr.nextDouble();

        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

    }



    public static void main(String [] args) {
        System.out.println("Welcome to Line comparision Computation Program on Master Branch");

        FanGeometry obj= new FanGeometry();
        System.out.println("enter first line cordinates");
        double flineLength=obj.length();
        //System.out.println("First line lenghth : " +flineLength);
        System.out.println("enter second line cordinates");
        double slineLength=obj.length();
        //System.out.println("second line length: " +slineLength);

        if(flineLength == slineLength )
        {
            System.out.println("Lines are equals ");
        }
        else
            System.out.println("Lines are not equals");
    }
}import java.util.Scanner;
public class FanGeometry {


    public double length(){
        Scanner scnr = new Scanner(System.in);
        double x1;
        double y1;
        double x2;
        double y2;
        double pointslength;

        pointslength = 0.0;
        System.out.println("enter x1 value");
        x1 = scnr.nextDouble();
        System.out.println("enter y1 value");
        y1 = scnr.nextDouble();
        System.out.println("enter x2 value");
        x2 = scnr.nextDouble();
        System.out.println("enter y2 value");
        y2 = scnr.nextDouble();

        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));

    }



    public static void main(String [] args) {
        System.out.println("Welcome to Line comparision Computation Program on Master Branch");

        FanGeometry obj= new FanGeometry();
        System.out.println("enter first line cordinates");
        double flineLength=obj.length();
        //System.out.println("First line lenghth : " +flineLength);
        System.out.println("enter second line cordinates");
        double slineLength=obj.length();
        //System.out.println("second line length: " +slineLength);

        if(flineLength == slineLength )
        {
            System.out.println("Lines are equals ");
        }
        else
            System.out.println("Lines are not equals");
    }
}