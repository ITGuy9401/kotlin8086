package eu.arcangelovicedomini.kotlin8086.emulator.internal

class Memory constructor(val size: Int) {

    val data: Array<Boolean> = arrayOf()

    init {
        for (i in 0..size) {
            data.plus(false)
        }
    }

    override fun toString(): String = "MEMORY[SIZE=$size,DATA={${eu.arcangelovicedomini.kotlin8086.emulator.internal.toString(data)}}]"
}