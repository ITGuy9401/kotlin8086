package eu.arcangelovicedomini.kotlin8086.emulator.internal

class Memory constructor(val size: Int) {

    var data: Long = 0
        set(data) {
            if (data <2.0 pow size.toDouble())
                field = data
            else
                throw IndexOutOfBoundsException("Data ($data) is too short or long for this $size bit memory!")
        }

    override fun toString(): String = "MEMORY[SIZE=$size,DATA={${data.toString(2)}}]"
}