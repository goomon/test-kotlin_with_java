fun String.first(): Char = this[0]

fun String.addFirst(char: Char) = char + this.substring(0)