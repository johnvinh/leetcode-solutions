import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
    @Test
    public void example1() {
        assertArrayEquals(new int[]{24,12,8,6}, obj.productExceptSelf(new int[]{1, 2, 3, 4}));
    }
}