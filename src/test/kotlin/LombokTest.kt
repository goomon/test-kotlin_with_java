import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LombokTest {

    @Test
    fun `lombok load test`() {
        val student = JStudentLombok()

        student.name = "Tommy"
        student.age = 10

        assertEquals("Tommy", student.name)
        assertEquals(10, student.age)
    }
}