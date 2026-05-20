import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

    @Test
    public void testFoo() {
        int result = 5 + 1 * 2;
        assertEquals(result, 7);
    }
    @Test
    public void testFoo2() {
        int result = 5;
        assertEquals(result, 5);
    }
}