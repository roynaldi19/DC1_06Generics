package `03MendeklarasikanFungsiGeneric`

public fun <T> List<T>.slice(indices: Iterable<Int>) {
    /*...*/
}

fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice(1..10))
}