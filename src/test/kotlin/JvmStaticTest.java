import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JvmStaticTest {

    @Test
    public void kotlinCompanionObjectClassTest() {
        assertEquals("CompanionObjectClass", CompanionObjectClass.Companion.getId1());
        assertEquals("CompanionObjectClass", CompanionObjectClass.getId2());
        assertEquals("CompanionObjectClass", CompanionObjectClass.ID3);

        assertEquals("CompanionObjectClass hello!", CompanionObjectClass.Companion.hello1());
        assertEquals("CompanionObjectClass hello!", CompanionObjectClass.hello2());
    }

    @Test
    public void kotlinObjectClassTest() {
        assertEquals("ObjectClass", ObjectClass.INSTANCE.getId1());
        assertEquals("ObjectClass", ObjectClass.getId2());
        assertEquals("ObjectClass", ObjectClass.ID3);

        assertEquals("ObjectClass hello!",ObjectClass.INSTANCE.hello1());
        assertEquals("ObjectClass hello!",ObjectClass.hello2());
    }
}
