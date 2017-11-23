package eu.arcangelovicedomini.kotlin8086.emulator.internal

class SplittedRegister constructor(private val splittedSize: Int) {
    var high: Register = Register(splittedSize)
    var low: Register = Register(splittedSize)

    var data: Array<Boolean>
        get () {
            var result: Array<Boolean> = arrayOf()
            result.plus(high.data)
            result.plus(low.data)
            return result
        }
        set (data) {
            if (data.size == splittedSize * 2) {
                high.data = data.slice(0..splittedSize).toTypedArray()
                low.data = data.slice(splittedSize + 1..data.size).toTypedArray()
            } else
                throw IndexOutOfBoundsException("Data (${data.size} bit) is too short or long for this ${splittedSize * 2} bit register!")
        }


    override fun toString(): String = "REGISTER[HIGH{$high},LOW{$low}]"
}