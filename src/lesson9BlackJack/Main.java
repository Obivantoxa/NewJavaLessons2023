package lesson9BlackJack;

public class Main {

    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();
        Dealer dealer = new Dealer();

        Player player1 = new Player();
        Player player2 = new Player();
        player1.setName("Вася");
        player2.setName("Петя");

        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers();
        blackJack.dealRestCardsToallPlayers();

        blackJack.printWinner();



    }
}
