package chap11_intreface;

import chap11_intreface.multiinherit.MultiflexStadium;
import chap11_intreface.multiinherit.SeoulMultiflexStadium;

public class _02_multiInherit {
    public static void main(String[] args) {
        // MultiflexStadium이 Stadium과 ConcertHall의 형태를
        // 가지고 있기 때문에 SeoulMultiflexStadium에도 Stadium,
        // ConcertHall의 형태를 가지게 된다. Stadium타입의 변수나
        // ConcertHall 타입의 변수로도 사용가능하다.
        MultiflexStadium ms = new SeoulMultiflexStadium();

        ms.getSportsSchedule(3);
        int sportsTicket =  ms. getSportsTicketPrice(2);
        ms.getSupportersItem(2);

        ms.getRemainSeat();
        int concertTicket = ms.getTicketPrice(5);
        ms.playSportsAndConcert();
    }
}
