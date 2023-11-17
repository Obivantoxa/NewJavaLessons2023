package lesson9BlackJack;

public class Main {

    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();
        Dealer dealer = new Dealer();

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        player1.setName("Светочка");
        player2.setName("Антон");
        player3.setName("Петушок");

        blackJack.addPlayerToGame(player1);
        blackJack.addPlayerToGame(player2);
        blackJack.addPlayerToGame(player3);
        blackJack.addPlayerToGame(dealer);

        blackJack.dealTwoCardsToAllPlayers();
        blackJack.dealRestCardsToallPlayers();

        blackJack.printWinner();



    }
}
