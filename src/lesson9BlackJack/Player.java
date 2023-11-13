package lesson9BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements IPlayer {

    private String name;
    private ArrayList<Card> hand = new ArrayList<>();
    private boolean inGame = true;

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addCardToHand(Card card) {
        hand.add(card);
    }

    @Override
    public boolean needsCard() {
        this.openHand();
        System.out.println("Нужна ли еще одна карта?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("Да") || answer.equalsIgnoreCase("Yes")) {
            return true;
        }
        return false;
    }

    @Override
    public void openHand() {
        int sum = 0;
        System.out.println("----Ваши карты----");
        for (Card c : hand) {
            sum += c.getValue();
            System.out.println(c.getName());
        }
        System.out.println("**подсказка** " + sum);

//        for (Card c : hand){
//            System.out.println(sum+=c.getValue());
//        }
    }

    public int valuesHand() {
        int value = 0;
        for (Card c : hand) {
            value += c.getValue();
        }
        return value;
    }

    public String getName() {
        return name;
    }
    //    public int checkWin() {
//        int win = 0;
//        for (Card c : hand) {
//            if (c.getValue() > 21) {
//                win = c.getValue();
//            }else{
//                c.getValue() <
//            }
//        }
//    }
}
