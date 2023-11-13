package lesson9BlackJack;

public interface IPlayer {
    void setName(String name);

    void addCardToHand(Card card );

    boolean needsCard();

    void openHand();

}
