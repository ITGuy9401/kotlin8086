package eu.arcangelovicedomini.kotlin8086.emulator.internal

class SplittedRegister constructor(private val size: Int) {
    var high: Register = Register(size/2)
    var low: Register = Register(size/2)

    var data: Int = 0
        get () = "${high.data.toString(2)}${low.data.toString(2)}".toInt(2)
        set (data) {
            if (data < 2.0 pow size.toDouble()) {
                field = data
            } else
                throw IndexOutOfBoundsException("Data ($data) is too long for this $size bit register!")
        }


    override fun toString(): String = "REGISTER[HIGH{$high},LOW{$low}]"
}