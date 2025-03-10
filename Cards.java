package Cards;

import java.util.Random;

public class Card {
    private int faceValue; // Stores the face value of the card
    private String suit; // Stores the suit of the card
    private static int numCardsCreated = 0; // Static attribute to count the number of Card objects created.

    // Constructor for creating a Card object with a specific face value and suit.
    public Card(int faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
        numCardsCreated++;
    }

    // Getter method for faceValue.
    public int getFaceValue() {
        return faceValue;
    }

    // Setter method for faceValue.
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    // Getter method for suit.
    public String getSuit() {
        return suit;
    }

    // Setter method for suit.
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Static method to get the number of Card objects created.
    public static int getNumCardsCreated() {
        return numCardsCreated;
    }

    // Method to convert face values to written out numbers
    public String writtenOutNumber(int faceValue) {
        switch (faceValue) {
            case 1:
                return "Ace";
            case 11:
                return "Soldier";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                if (faceValue >= 2 && faceValue <= 10) {
                    // Written out numbers for 2 to 10
                    String[] writtenOutNumbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
                    return writtenOutNumbers[faceValue - 2];
                }
                return "Invalid";
        }
    }

    // Method for printing out an organized output
    public String toString() {
        return writtenOutNumber(faceValue) + " of " + suit;
    }

    // Method for dealing a random card
    public static Card deal() {
        Random random = new Random();
        int randomFaceValue = random.nextInt(13) + 1;
        String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String randomSuit = suits[random.nextInt(suits.length)];

        return new Card(randomFaceValue, randomSuit);
    }
}
