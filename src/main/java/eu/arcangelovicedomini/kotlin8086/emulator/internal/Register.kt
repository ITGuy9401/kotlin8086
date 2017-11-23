package eu.arcangelovicedomini.kotlin8086.emulator.internal

class Register constructor(val size: Int) {

    var data: Int = 0
        set (data) {
            if (data <= 2.0 pow size.toDouble())
                field = data
            else
                throw IndexOutOfBoundsException("Data ($data) is too long for this $size bit register!")
        }

    override fun toString(): String = "REGISTER[SIZE=$size,DATA={${data.toString(2)}}}]"
}