import java.util.Scanner;
public class AreaCube{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side of a cube:");
        double side = sc.nextInt();

        double area = 6*side*side;
        System.out.println("Area of a cube:"+area);
    }
}