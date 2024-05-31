fun main() {

    println("Введите число:")
    val number = Integer.valueOf(readLine())

    for (x in 1..9) {
        println("$number * $x = " + (number * x))
    }
}