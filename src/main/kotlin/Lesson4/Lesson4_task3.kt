fun main() {

    val sunShine = true
    val openTent = true
    val humidity = 20
    val season = "Лето"
    val result = (sunShine == SUN_SHINE) && (openTent == OPEN_TENT) && (humidity == HUMIDITI_AV) && (season === SEASON_AV)

    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}

const val SUN_SHINE = true
const val OPEN_TENT = true
const val HUMIDITI_AV = 20
const val SEASON_AV = "Зима"

