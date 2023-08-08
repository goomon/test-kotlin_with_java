import java.time.LocalDate

class Student {

    var name: String? = null

    @JvmField
    var studentId: String? = null

    var birthDate: LocalDate? = null

    val age: Int = 10
}