import java.util.Scanner;

public class CuboidArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter length of cuboid: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of cuboid: ");
        double width = sc.nextDouble();

        System.out.print("Enter height of cuboid: ");
        double height = sc.nextDouble();

        double area = 2 * (length * width + length * height + width * height);

        System.out.println("Total Surface Area of the Cuboid = " + area);

        sc.close();
    }
}
