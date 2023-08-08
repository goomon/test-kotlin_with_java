import org.junit.jupiter.api.Test
import java.time.LocalDate
import kotlin.test.assertEquals

class JavaClassUsageTest {

    @Test
    fun `getter and setter test`() {
        val student = JStudent()

        student.name = "Tommy"
        student.birthDate = LocalDate.of(1998, 10, 12)

        assertEquals("Tommy", student.name)
        assertEquals(LocalDate.of(1998, 10, 12), student.birthDate)
    }

    @Test
    fun `get method test`() {
        val student = JStudent()

        student.uuid
    }
}