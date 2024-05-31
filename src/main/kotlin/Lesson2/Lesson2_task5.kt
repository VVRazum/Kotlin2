import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    val P = 70000
    val r = 16.7
    val t = 20

    val rOne = (r / 100) + 1
    val mathR = rOne.pow(t)

    val A = P * mathR
    val aFinish = (A * 1000.0).roundToInt() / 1000.0

    println(aFinish)
}



