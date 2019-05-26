interface DataProcessor<T> {
    fun processData(): T
}

class NoResultDataProcessor : DataProcessor<Unit> {
    override fun processData() {

        // No need of a explicit return
    }
}