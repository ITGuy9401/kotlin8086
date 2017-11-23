package eu.arcangelovicedomini.kotlin8086.emulator.internal

fun toBinary(data: String): Array<Boolean> {
    var result: Array<Boolean> = arrayOf()
    for (c in data)
        result.plus(c.equals('1'))
    return result
}

fun toString(data: Array<Boolean>): String {
    return data
            .joinToString("", "", "")
            .replace("false", "0")
            .replace("true", "1")
}