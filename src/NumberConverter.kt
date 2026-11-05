import kotlin.math.floor
import kotlin.math.log
import kotlin.math.max
import kotlin.math.pow

val DIGITS = (('0'..'9') + ('a'..'z')).toCharArray()

class NumberConverter {

    fun convert(number: Int, base: Int): String {

        var remainder = number
        val numDigits = getNumDigits(number, base)
        var result = ""

        for (i in numDigits downTo 1) {
            val factor = base.toDouble().pow(i - 1.0).toInt()
            val nextDigit = (remainder / factor)
            result += DIGITS[nextDigit]
            remainder -= nextDigit * factor
        }

        return result
    }

    private fun getNumDigits(number: Int, base: Int): Int {
        val num = max(1.0, number.toDouble())
        return (floor(log(num, base.toDouble())) + 1).toInt()
    }
}