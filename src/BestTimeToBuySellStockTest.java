import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {
    BestTimeToBuySellStock obj = new BestTimeToBuySellStock();

    @Test
    public void example1() {
        assertEquals(5, obj.maxProfit(new int[]{7,1,5,3,6,4}));
    }

    @Test
    public void example2() {
        assertEquals(0, obj.maxProfit(new int[]{7,6,4,3,1}));
    }
}