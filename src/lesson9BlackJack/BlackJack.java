package lesson9BlackJack;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {

    private Koloda koloda = new Koloda();
    private ArrayList<Player> players = new ArrayList<>();

    @Override
    public void addPlayerToGame(Player player) {
        if (players.size() < 9) {
            players.add(player);
        } else {
            System.out.println("Нет свободных мест для игроков");
        }
    }

    @Override
    public void dealTwoCardsToAllPlayers() {
        for (Player p : players) {
            p.addCardToHand(koloda.getRandomCard());
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    @Override
    public void dealRestCardsToallPlayers() {
        for (Player p : players) {
            while (p.needsCard()) {
                p.addCardToHand(koloda.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
        for(Player p : players){
            if(p.valuesHand() >21 ){
                p.setInGame(false);
            }
        }

        if(countPlayersInGame() == 0){
            for (Player p : players){
                if(p instanceof Dealer){
                    System.out.println("Dealer win");
                    p.openHand();
                    return;
                }
            }
        }
        int valueWinner = 0;
        for(Player p :players){
            if(p.isInGame()&& p.valuesHand()>valueWinner){
                valueWinner = p.valuesHand();
            }
        }

        for(Player p:players){
            if(p.valuesHand()==valueWinner){
                System.out.println("Winner  "+ p.getName());
            }

        }
    }

    public int countPlayersInGame() {
        int count = 0;
        for (Player p : players) {
            if (p.isInGame()) {
                count++;
            }

        }
        return count;
    }
}
