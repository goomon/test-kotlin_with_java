import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KotlinClassUsageTest {

    @Test
    public void getterAndSetterTest() {
        Student student = new Student();

        student.setName("Tommy");
        student.setBirthDate(LocalDate.of(1998, 10, 12));

        assertEquals("Tommy", student.getName());
        assertEquals(LocalDate.of(1998, 10, 12), student.getBirthDate());
        assertEquals(10, student.getAge());
    }

    @Test
    public void jvmFieldTest() {
        Student student = new Student();

        student.setName("Tommy");
        student.setBirthDate(LocalDate.of(1998, 10, 12));
        student.studentId = "20201234";

        assertEquals("Tommy", student.getName());
        assertEquals(LocalDate.of(1998, 10, 12), student.getBirthDate());
        assertEquals(10, student.getAge());
        assertEquals("20201234", student.studentId);
    }
}
