package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void rightPlayerGoTooHigh() {
        int result = new BlackJack().play(10, 20);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void rightPlayerWins() {
        int result = new BlackJack().play(5, 9);
        Assertions.assertEquals(9, result);
    }
}
