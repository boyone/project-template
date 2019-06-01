package wlb;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoyaltyTest {
    @Test
    public void receiveTotalPrice239_90ShouldGetNormalPoints23() {
        // arrange
        int expectedNormalPoints = 23;
        Royalty royalty = new Royalty();

        // action
        int actualNormalPoints = royalty.calculate(239.90);

        // assert
        assertEquals(expectedNormalPoints, actualNormalPoints);
    }
}