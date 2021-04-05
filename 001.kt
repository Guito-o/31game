import java.util.Random

fun main() {
    var a = 0

    while (a < 31) {
        var count = 0
        val random = Random()
        var rnum = random.nextInt(3)
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
        if (a == 30){
            println("My Win")
            break
        }
        println("--")

        for (j in 1..3) {
            if ((a + j - 2) % 4 == 0) {
                println("CPU : $j")
                for (i in 1..j) {
                    if (a <= 31)
                    a += 1
                    print("$a ")
                }
                println()
                if (a == 30) {
                    println("CPU Win")
                }
                break
            }
            count += 1
        }
        if (count == 3) {
            rnum += 1
            println("CPU : $rnum")
            for (i in 1..rnum) {
                a += 1
                print("$a ")
            }
            println()
            if (a == 30) {
                println("CPU Win")
            }
        }
        println("--")
    }
}
