val DIGITS = (('0'..'9') + ('A'..'Z')).toCharArray()

class NumberConverter {

    fun convert(number: Int, base: Int): String {
        require(base in 2..36) { "Base must be between 2 and 36" }
        if (number == 0) return "0"

        var n = number
        val result = StringBuilder()

        while (n > 0) {
            val remainder = (n % base)
            result.append(DIGITS[remainder])
            n /= base
        }

        return result.reverse().toString()
    }
}