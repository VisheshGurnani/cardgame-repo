import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dealer
{
    public static boolean isPlaying;
    public static ArrayList<Card> allCards = new ArrayList<>();

    public static void main(String[] args)
    {
        // Setup deck
        for (int i = 0; i < 52; i++)
        {
            int suit = i / 13; // 0 to 3
            int value = (i % 13) + 1; // 1 to 13
            Card newCard = new Card(value, suit);
            allCards.add(0, newCard); // add to front
        }

        Collections.shuffle(allCards);

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of turns to deal: ");
        int numberOfTurns = scanner.nextInt();

        DealCards(true, numberOfTurns);
        PrintDeckSize();

        scanner.close();
    }

    static void PrintDeckSize()
    {
        System.out.println("\n" + allCards.size() + " cards remaining in the stack.");
    }

    static Card DealCards(boolean shouldDeal, int numberOfTurns)
    {
        Card top = null;

        for (int i = 0; i < numberOfTurns; i++)
        {
            if (shouldDeal && !allCards.isEmpty())
            {
                top = allCards.remove(0); // remove top card
                System.out.println("Dealt: " + top);
            }
            else if (allCards.isEmpty())
            {
                System.out.println("No more cards to deal.");
                break;
            }
        }

        return top;
    }
}
