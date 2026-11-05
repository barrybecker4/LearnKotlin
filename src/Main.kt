
fun main() {
    val converter = NumberConverter()

    println("Enter a number:")
    var input = readln()
    val myNumber = input.toInt()
    println("Enter the base that you want to convert to:")
    input = readln()
    val myBase = input.toInt()

    print("The number $myNumber expressed in base $myBase is ")
    println(converter.convert(myNumber, myBase))

}