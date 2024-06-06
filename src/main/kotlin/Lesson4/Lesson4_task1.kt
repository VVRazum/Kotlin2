fun main() {

    val todayReserve = 13
    val tomorrowFreeInfo = 4
    val tomorrowReserve = MAX_CHAIRS - tomorrowFreeInfo
    val todayFree = todayReserve != MAX_CHAIRS
    val tomorrowFree = tomorrowReserve != MAX_CHAIRS

    println("Доступность столиков на сегодня: $todayFree\n" +
            "Доступность столиков на завтра: $tomorrowFree")
}

const val MAX_CHAIRS = 13