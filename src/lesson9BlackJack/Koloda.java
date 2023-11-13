package lesson9BlackJack;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Koloda implements IKoloda {

    ArrayList<Card> cards = new ArrayList<>(); // ,безразмерный массив с картами
    public Koloda(){
        this.preparedCards();
    }

    public void preparedCards(){
        cards.add(new Card("Двойка крести",2 ));
        cards.add(new Card("Двойка черви",2 ));
        cards.add(new Card("Двойка пика",2 ));
        cards.add(new Card("Двойка бубна",2 ));

        cards.add(new Card("Тройка крести",3 ));
        cards.add(new Card("Тройка черви",3 ));
        cards.add(new Card("Тройка пика",3 ));
        cards.add(new Card("Тройка бубна",3 ));

        cards.add(new Card("Четверка крести",4 ));
        cards.add(new Card("Четверка черви",4 ));
        cards.add(new Card("Четверка пика",4 ));
        cards.add(new Card("Четверка бубна",4 ));

        cards.add(new Card("Пятерка крести",5 ));
        cards.add(new Card("Пятерка черви",5 ));
        cards.add(new Card("Пятерка пика",5 ));
        cards.add(new Card("Пятерка бубна",5 ));

        cards.add(new Card("Шестерка крести",6 ));
        cards.add(new Card("Шестерка черви",6 ));
        cards.add(new Card("Шестерка пика",6 ));
        cards.add(new Card("Шестерка бубна",6 ));

        cards.add(new Card("Семерка крести",7 ));
        cards.add(new Card("Семерка черви",7 ));
        cards.add(new Card("Семерка пика",7));
        cards.add(new Card("Семерка бубна",7 ));

        cards.add(new Card("Восьмерка крести",8 ));
        cards.add(new Card("Восьмерка черви",8 ));
        cards.add(new Card("Восьмерка пика",8));
        cards.add(new Card("Восьмерка бубна",8 ));

        cards.add(new Card("Девятка крести",9 ));
        cards.add(new Card("Девятка черви",9 ));
        cards.add(new Card("Девятка пика",9));
        cards.add(new Card("Девятка бубна",9 ));

        cards.add(new Card("Десятка крести",10 ));
        cards.add(new Card("Десятка черви",10));
        cards.add(new Card("Десятка пика",10));
        cards.add(new Card("Десятка бубна",10 ));

        cards.add(new Card("Валет крести",10 ));
        cards.add(new Card("Валет черви",10 ));
        cards.add(new Card("Валет пика",10));
        cards.add(new Card("Валет бубна",10));

        cards.add(new Card("Дама крести",10 ));
        cards.add(new Card("Дама черви",10 ));
        cards.add(new Card("Дама пика",10));
        cards.add(new Card("Дама бубна",10));

        cards.add(new Card("Король крести",10 ));
        cards.add(new Card("Король черви",10 ));
        cards.add(new Card("Король пика",10));
        cards.add(new Card("Король бубна",10));

        cards.add(new Card("Туз крести",11 ));
        cards.add(new Card("Туз черви",11 ));
        cards.add(new Card("Туз пика",11));
        cards.add(new Card("Туз бубна",11));



    }

    @Override
    public Card getRandomCard() {


// nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
        int index = ThreadLocalRandom.current().nextInt(0, cards.size());
        return cards.get(index);
    }
}
