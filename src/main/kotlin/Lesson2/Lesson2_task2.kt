fun main() {

    val oldWorkers = 50
    val salaryOldWorkers = 30000
    val junWorkers = 30
    val salaryJunWorkers = 20000

    val sumOldWorkers = oldWorkers * salaryOldWorkers
    println(sumOldWorkers)

    val allWorkers = sumOldWorkers + (junWorkers * salaryJunWorkers)
    println(allWorkers)

    val avgSalary = allWorkers / (oldWorkers + junWorkers)
    println(avgSalary)
}


