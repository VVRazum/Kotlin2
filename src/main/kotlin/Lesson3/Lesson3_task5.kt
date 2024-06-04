fun main() {

    val someStep = "D2-D4;0"
    val stepPars = someStep.split("-", ";")
    val (startStep,finishStep,numberStep) = Triple(stepPars[0], stepPars[1], stepPars[2])

    println("$startStep\n$finishStep\n$numberStep")

}


