fun main() {

    var posOneWeight = 20
    var posOneVol = 80
    var posAv = posOneWeight > AVERAGE_MIN_WEIGHT && posOneWeight <= AVERAGE_MAX_WEIGHT && posOneVol < AVERAGE_VOLUME

    println("Груз с весом $posOneWeight кг и объемом $posOneVol соответствует категории 'Average':$posAv")

    posOneWeight = 50
    posOneVol = 100

    posAv = posOneWeight > AVERAGE_MIN_WEIGHT && posOneWeight <= AVERAGE_MAX_WEIGHT && posOneVol < AVERAGE_VOLUME
    println("Груз с весом $posOneWeight кг и объемом $posOneVol соответствует категории 'Average':$posAv")

// Не понимаю, как можно сделать сравнение внутри println без сравнения диапазонов


}

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_VOLUME = 100