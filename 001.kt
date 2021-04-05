fun main() {
    var a = 0
    while (a < 31) {
        var num = readLine()!!.toInt()

        if (num > 3)
            num = 3
        else if (num < 1)
            num = 1

        for (i in 1..num) {
            if (a <= 31)
                a += 1
                print("$a ")
        }
        println()

        for (i in )
    }
}
