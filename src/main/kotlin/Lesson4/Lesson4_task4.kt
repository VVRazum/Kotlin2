fun main() {
    val dayOfTrain = 5
    val oddNum = dayOfTrain % 2
    when {
        oddNum % 2 == 0 -> println(""" |Упражнение для рук: false
                |Упражнения для ног: true
                |Упражнения для спины: true
                |Упражнения для пресса: false""".trimMargin())
        else -> println("""|Упражнение для рук: true
                |Упражнения для ног: false
                |Упражнения для спины: false
                |Упражнения для пресса: true""".trimMargin())
    }

}



