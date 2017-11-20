package eu.arcangelovicedomini.kotlin8086.emulator

fun disassembler(data: Array<Boolean>): String {
    val chunkSize: Int = 8

    for (pointer in 0 until data.size step chunkSize) {
        var chunk = data
                .sliceArray(pointer..pointer + chunkSize)
                .joinToString("", "", "")
                .replace("true", "1")
                .replace("false", "0")

        var hex = Integer.toHexString(Integer.parseInt(chunk, 2))

    }
    return ""
}