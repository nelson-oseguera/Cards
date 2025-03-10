package Cards;

import java.util.Scanner;

public class PlayCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many cards do you want? "); // Prompt the user how many cards they want
        int numCards = scanner.nextInt();

        // Deal and print the specified number of cards.
        for (int i = 0; i < numCards; i++) {
            Card card = Card.deal();
            System.out.println(card.toString());
        }

    }
}
