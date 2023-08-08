import org.junit.jupiter.api.Test
import java.io.IOException

class KotlinThrowTest {

    @Test
    fun `handling exception with catch test`() {
        try {
            throwIOException()
        } catch (e: IOException) {
            // No action.
        }
    }

    @Throws(IOException::class)
    fun throwIOException() {
        throw IOException()
    }
}