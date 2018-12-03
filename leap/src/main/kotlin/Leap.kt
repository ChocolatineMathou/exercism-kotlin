class Year(private val year:Int) {
   val isLeap: Boolean = when {
      this isDivisibleBy 400 -> true
      this isDivisibleBy 100 -> false
      this isDivisibleBy 4 -> true
      else -> false
   }
   private infix fun isDivisibleBy(i: Int) = year % i == 0
}