import java.util.Scanner;
public class Color_Mixer
{
    public static void main(String[] args)
    {

        String enteredColor1;
        String enteredColor2;

        Scanner keyboard = new Scanner(System.in);       
        System.out.print("Enter in the name of a primary color: ");
        enteredColor1 = keyboard.nextLine();
        if (! enteredColor1.equals ("red") && ! enteredColor1.equals ("blue") && ! enteredColor1.equals ("yellow"))
        {
            System.out.println("Error!");
        }

        System.out.print("Enter in the name of another primary color: ");
        enteredColor2 = keyboard.nextLine();
        if (! enteredColor2.equals ("red") && ! enteredColor2.equals ("blue") && ! enteredColor2.equals ("yellow"))
        {
            System.out.println("Error!");
        }

        if (enteredColor1.equals ("red") && enteredColor2.equals ("blue"))
        {
            System.out.print("When you mix red and blue, you get purple.");
        }
        else if (enteredColor1.equals ("red") && enteredColor2.equals ("yellow"))
        {
            System.out.print("When you mix red and yellow, you get orange.");
        }
        else if (enteredColor1.equals ("blue") && enteredColor2.equals ("yellow"))
        {
            System.out.print("When you mix blue and yellow, you get green.");
        }
        else if (enteredColor1.equals ("blue") && enteredColor2.equals ("red"))
        {
            System.out.print("When you mix blue and red, you get purple.");
        }
        else if (enteredColor1.equals ("yellow") && enteredColor2.equals ("red"))
        {
            System.out.print("When you mix yellow and red, you get orange.");
        }
        else if (enteredColor1.equals ("yellow") && enteredColor2.equals ("blue"))
        {
            System.out.print("When you mix yellow and blue, you get green.");
        }
        else
        {
            System.out.print("I don't know what you get mixing " + enteredColor1);
            System.out.print(" and " + enteredColor2 + ".");
        }

        return;
    }
}