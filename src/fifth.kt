import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("How many elements you want to enter")
    val a = scanner.nextInt()

    val list = mutableListOf<Int>()

    for (i in 0 until a)
    {
        print("Enter the element $i == ")
        val data = scanner.nextInt()
        list.add(data)
    }

    for (i in list.indices)
    {
        println("Element of index $i is ${list[i]}")
    }
}