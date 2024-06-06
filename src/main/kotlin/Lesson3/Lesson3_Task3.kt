fun main() {

    val startNumber = 2

    val one = startNumber * 1
    val two = startNumber * 2
    val three = startNumber * 3
    val four = startNumber * 4
    val five = startNumber * 5
    val six = startNumber * 6
    val seven = startNumber * 7
    val eight = startNumber * 8
    val nine = startNumber * 9
    val finalString = """
                        |$startNumber x 1 = $one
                         |$startNumber x 2 = $two
                         |$startNumber x 3 = $three
                         |$startNumber x 4 = $four
                         |$startNumber x 5 = $five
                         |$startNumber x 6 = $six
                         |$startNumber x 7 = $seven
                         |$startNumber x 8 = $eight
                         |$startNumber x 9 = $nine""".trimMargin()

    println(finalString)

}


