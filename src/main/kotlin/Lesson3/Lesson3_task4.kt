fun main() {

//Ходят черные
    var startPos = "E2"
    var finishPos = "E4"
    var numMove = 1

    var sumMove = ("$startPos-$finishPos;$numMove")
    println(sumMove)

//Ходят белые
    startPos = "D2"
    finishPos = "D3"
    numMove = numMove + 1

    sumMove = """$startPos-$finishPos;$numMove"""
    println(sumMove)

}
