import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> (y ?: 0) - (x ?:0) })
    return arrayList
}
