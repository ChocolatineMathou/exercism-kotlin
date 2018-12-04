object Pangram {
    fun isPangram(str: String): Boolean {
        return ('a'..'z').all { str.contains(it, ignoreCase = true) }
    }
}