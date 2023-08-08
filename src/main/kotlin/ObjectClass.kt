class CompanionObjectClass {

    companion object {

        val id1: String = "CompanionObjectClass"

        @JvmStatic
        val id2: String = "CompanionObjectClass"

        const val ID3: String = "CompanionObjectClass"

        fun hello1() = "CompanionObjectClass hello!"

        @JvmStatic
        fun hello2() = "CompanionObjectClass hello!"
    }
}

object ObjectClass {

    val id1: String = "ObjectClass"

    @JvmStatic
    val id2: String = "ObjectClass"

    const val ID3: String = "ObjectClass"

    fun hello1() = "ObjectClass hello!"

    @JvmStatic
    fun hello2() = "ObjectClass hello!"
}