package lesson9BlackJack;

public class Dealer extends Player {
    private String name = "dealer";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean needsCard() {
        if (valuesHand() < 17) {
            return true;
        } else {
            return false;
        }
    }
}
