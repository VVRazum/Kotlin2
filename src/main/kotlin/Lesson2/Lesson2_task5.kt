import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {

    val pStarSum = 70000
    val rInterestRate = 16.7
    val tYears = 20
    val one = 1
    val hundred = 100
    val thousand = 1000


    val rOne = (rInterestRate / hundred) + one
    val mathR = rOne.pow(tYears)


    val aMid = pStarSum * mathR
    val aFinish = (aMid * thousand).roundToInt() / thousand

    println(aFinish)
}


