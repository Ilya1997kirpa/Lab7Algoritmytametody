package khai.amo.catalog.w3

interface ImpoExporter {
    var filename: String

    fun load(): Boolean
    fun write(): Boolean
}

