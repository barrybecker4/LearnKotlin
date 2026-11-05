import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class NumberConverterTest {


    @Test
    fun `should return correct conversion for base 2`() {
        val converter = NumberConverter()
        assertEquals("1010", converter.convert(10, 2))
        assertEquals("1", converter.convert(1, 2))
        assertEquals("10", converter.convert(2, 2))
        assertEquals("100", converter.convert(4, 2))
        assertEquals("0", converter.convert(0, 2))
        assertEquals("1011", converter.convert(11, 2))
        assertEquals("1100100", converter.convert(100, 2))
    }

    @Test
    fun `should return correct conversion for base 3`() {
        val converter = NumberConverter()
        assertEquals("101", converter.convert(10, 3))
        assertEquals("100", converter.convert(9, 3))
        assertEquals("10201", converter.convert(100, 3))
        assertEquals("12", converter.convert(5, 3))
        assertEquals("21", converter.convert(7, 3))
    }

    @Test
    fun `should return correct conversion for base 16`() {
        val converter = NumberConverter()
        assertEquals("A", converter.convert(10, 16))
        assertEquals("9", converter.convert(9, 16))
        assertEquals("64", converter.convert(100, 16))
        assertEquals("5", converter.convert(5, 16))
        assertEquals("5BA0", converter.convert(23456, 16))
    }
}