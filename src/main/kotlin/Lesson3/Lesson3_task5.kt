fun main() {

    val someStep = "D2-D4;0"
    val stepPars = someStep.split("-", ";")
    val startStep = stepPars[0]
    val finishStep = stepPars[1]
    val numberStep = stepPars[2]

    println("$startStep\n$finishStep\n$numberStep")

}


