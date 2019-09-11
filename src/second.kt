fun main() {

    val a = arrayOf(1,"KOTLIN",2)

    a.forEach {
        println(it)
    }

    a.forEach {its ->
        println(its)
    }

    a[2] = 5
    a.forEach {
        println(it)
    }

}