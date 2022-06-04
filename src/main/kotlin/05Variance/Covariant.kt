package `05Variance`

interface List<out E> : Collection<E> {
    operator fun get(index: Int): E
}