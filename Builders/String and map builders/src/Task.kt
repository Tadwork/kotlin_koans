import java.util.HashMap

fun buildMap(init: HashMap<Int,String>.() -> Unit) : Map<Int,String>{
    val newMap = HashMap<Int,String>()
    newMap.init()
    return newMap
}
fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
