import java.util.Scanner;
public class Shipping_Charges
{
    public static void main(String[] args)
    {
        double packageWeight;
        double cost;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        packageWeight = keyboard.nextDouble();
        
        if (packageWeight <= 2 && packageWeight > 0)
        {
            cost = packageWeight * 1.10;
            System.out.printf("The shipping cost is: $" + "%.2f", cost);
        }
        else if (packageWeight > 2 && packageWeight <= 6)
        {
            cost = packageWeight * 2.20;
            System.out.printf("The shipping cost is: $" + "%.2f", cost);
        }
        else if (packageWeight > 6 && packageWeight <= 10)
        {
            cost = packageWeight * 3.70;
            System.out.printf("The shipping cost is: $" + "%.2f", cost);
        }
        else if (packageWeight >= 10)
        {
            cost = packageWeight * 3.80;
            System.out.printf("The shipping cost is: $" + "%.2f", cost);
        }
        
        return;
    }
}