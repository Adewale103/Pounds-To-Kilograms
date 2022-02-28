import java.util.Scanner;
public class PoundsToKilogram{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);

     System.out.println("Enter a number in pounds");
     double pounds = input.nextDouble();


     double kg = (pounds * 0.454);

     System.out.printf("%.3f pounds is %.3f kilograms %n",pounds,kg);

     }
}
