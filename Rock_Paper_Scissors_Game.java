import java.util.Random;
import java.util.Scanner;
public class Rock_Paper_Scissors_Game
{
    public static void main(String[] args) 
    {
        Random rand = new Random();
        int randomNumber = rand.nextInt(2) + 1;
        int entry;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1 for rock, 2 for paper, or 3 for scissors:");
        entry = keyboard.nextInt();

        while (entry != randomNumber)
        {
            if (entry == 1 && randomNumber == 2)
            {
                System.out.println("The computer chose paper.");
                System.out.println("Paper wraps rock.");
                System.out.println("You lose!");
            }
            else if (entry == 1 && randomNumber == 3)
            {
                System.out.println("The computer chose scissors.");
                System.out.println("Rock smashes the scissors.");
                System.out.println("You win!");
            }
            else if (entry == 2 && randomNumber == 1)
            {
                System.out.println("The computer chose rock.");
                System.out.println("Paper wraps rock.");
                System.out.println("You win!");
            }
            else if (entry == 2 && randomNumber == 3)
            {
                System.out.println("The computer chose scissors.");
                System.out.println("Scissors cuts paper.");
                System.out.println("You lose!");
            }
            else if (entry == 3 && randomNumber == 1)
            {
                System.out.println("The computer chose rock.");
                System.out.println("Rock smashes the scissors.");
                System.out.println("You lose!");
            }
            else if (entry == 3 && randomNumber == 2)
            {
                System.out.println("The computer chose paper.");
                System.out.println("Scissors cuts paper.");
                System.out.println("You win!");
            }
            return;
        }
        System.out.println("Tie! Both you and the computer chose " + randomNumber + ".");
    }
}