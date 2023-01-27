import java.util.Scanner;
public class Prac2
{
    public static void main(String[] args)
    {
        int number1=98,number2=5, number3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        number3 = sc.nextInt();

        System.out.println("The reverse of the given number is: " + number1+number2+number3+"The product of no is"+number1*number2*number3);
    }
}