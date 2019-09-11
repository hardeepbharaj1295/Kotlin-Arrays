fun main() {

    val a = arrayOf(10,20)

    println(a[0])

    a[0] = 50

    println("*********************")

    for (i in 0 until a.size)
    {
        println("$i == ${a[i]}")
    }

    val b = setOf(1,2,"efsdgf")

}