fun main() {
    val commission = 0.75
    val commissionMin = 35
    val amount = 10_000
    var commissionAmount: Int

    if (amount * commission / 100 > commissionMin) {
        commissionAmount = (amount * commission / 100).toInt()
    } else {
        commissionAmount = commissionMin
    }

    println(commissionAmount)
}