package eu.arcangelovicedomini.kotlin8086.emulator

class Memory constructor(val limit: Int) {
    var data: Array<Boolean> = arrayOf()

    init {
        for (i in 0 until limit) data[i] = false
    }

    fun setValues(data: Array<Boolean>) {
        if (data.size > limit) throw ArrayIndexOutOfBoundsException("The specified data was too much big for this memory, actual limit is $limit bits, you've tried to insert ${data.size} bits")
        if (data.size < limit) throw ArrayIndexOutOfBoundsException("This method should fill every $limit bit in memory, not only ${data.size}")
        this.data = data
    }

    fun setValues(data: Array<Boolean>, start: Int) {
        if (data.size > limit) throw ArrayIndexOutOfBoundsException("The specified data was too much big for this memory, actual limit is $limit bits, you've tried to insert ${data.size} bits")
        if (start + data.size > limit) throw ArrayIndexOutOfBoundsException("The specified data was too much big for this memory, actual limit is $limit bits, you've tried to insert ${data.size} bits starting from $start")
        for (i in start until start + data.size) this.data[i] = data[i - start]
    }
}