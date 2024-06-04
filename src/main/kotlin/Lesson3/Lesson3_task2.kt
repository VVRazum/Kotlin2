fun main() {

    val namePrimary = "Татьяна"
    val secondNamePrimary = "Сергеевна"
    val surnamePrimary = "Андреева"
    val agePrimary = 20
    val surnameSecondary = "Сидорова"
    val ageSecondary = 22

    var finalMsg = ("$surnamePrimary $namePrimary $secondNamePrimary, $agePrimary")
    println(finalMsg)

    finalMsg = ("$surnameSecondary $namePrimary $secondNamePrimary, $ageSecondary")
    println(finalMsg)
}