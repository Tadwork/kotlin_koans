class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(propertyValue) {
            this.counter++
            field = propertyValue
        }
}
