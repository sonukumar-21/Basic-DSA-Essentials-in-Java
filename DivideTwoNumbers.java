import java.util.Scanner;
public class DivideTwoNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        if(num2 != 0){
            int div= num1 / num2;
            System.out.println("The division of "+num1+" by "+num2+" is: "+div);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}