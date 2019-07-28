class LazyProperty(val initializer: () -> Int) {
    var actual:Int? = null
    val lazy: Int
        get() {
            if(actual == null) actual = initializer()
            return actual!!
        }
}
