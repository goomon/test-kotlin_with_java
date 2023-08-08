import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KotlinExtensionTest {

    @Test
    public void kotlinExtensionTest() {
        assertEquals('H', StringExtensionKt.first("Hello!"));
        assertEquals("HHello!", StringExtensionKt.addFirst("Hello!", 'H'));
    }
}
