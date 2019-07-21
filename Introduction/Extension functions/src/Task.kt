fun Int.r(): RationalNumber = RationalNumber(this)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first,this.second)

data class RationalNumber(val numerator: Int, val denominator: Int = 1)

