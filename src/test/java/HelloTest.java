import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    void testAdd() {
        Hello h = new Hello();

        assertEquals(5, h.add(2, 3));
    }
}
