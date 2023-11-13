package lesson9BlackJack;

public interface IBlackJack {

    void addPlayerToGame(Player player);

    void dealTwoCardsToAllPlayers();

    void dealRestCardsToallPlayers();


    void printWinner();


}
