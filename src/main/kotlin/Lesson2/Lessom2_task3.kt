fun main() {

    val startHour = 9
    val startMinutes = 39
    val minutesPerHour = 60
    val minutesInTrip = 457

    val startTotalMinutes = startHour * minutesPerHour + startMinutes
    val finishTotalMinutes = startTotalMinutes + minutesInTrip
    val finishHours = finishTotalMinutes / minutesPerHour
    val finishMinutes = finishTotalMinutes % minutesPerHour

    println("$finishHours:$finishMinutes")
}

