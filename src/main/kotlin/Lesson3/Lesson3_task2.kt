fun main() {

    val namePrimary = "Татьяна"
    val secondNamePrimary = "Сергеевна"
    var surnamePrimary = "Андреева"
    var agePrimary = 20
    var finalMsg = ("$surnamePrimary $namePrimary $secondNamePrimary, $agePrimary")

    println(finalMsg)

    surnamePrimary  = "Сидорова"
    agePrimary = 22
    finalMsg = ("$surnamePrimary $namePrimary $secondNamePrimary, $agePrimary")
    println(finalMsg)

}