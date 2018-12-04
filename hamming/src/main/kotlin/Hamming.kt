object Hamming {
    fun compute(x: String, y: String): Int {
        require(x.length == y.length) { "left and right strands must be of equal length." }
        return x.zip(y).count { it.first != it.second }
    }
}