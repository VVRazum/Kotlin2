fun main() {

    val crystal = 7
    val metall = 11
    val crystalName = "Buff по кристалам"
    val metallName = "Buff по железу"
    val buffPercent = 20

    val crystalVsBuff = crystal * buffPercent/ 100
    val metallVSBuff = metall * buffPercent / 100

    println("$crystalName:$crystalVsBuff")
    println("$metallName:$metallVSBuff")

}

