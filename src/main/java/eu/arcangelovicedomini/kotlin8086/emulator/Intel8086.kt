package eu.arcangelovicedomini.kotlin8086.emulator

import eu.arcangelovicedomini.kotlin8086.emulator.internal.Register
import eu.arcangelovicedomini.kotlin8086.emulator.internal.SplittedRegister

class Intel8086 {

    // Usable registes
    val AX: SplittedRegister = SplittedRegister(16)
    val BX: SplittedRegister = SplittedRegister(16)
    val CX: SplittedRegister = SplittedRegister(16)
    val DX: SplittedRegister = SplittedRegister(16)

    // Index Registes
    /**
     * Source Index
     */
    val SI: Register = Register(16)
    /**
     * Destination Index
     */
    val DI: Register = Register(16)
    /**
     * Stack Pointer
     */
    val SP: Register = Register(16)
    /**
     * Base Pointer
     */
    val BP: Register = Register(16)

    // Segment Registers
    /**
     * Code Segment
     */
    val CS: Register = Register(16)
    /**
     * Data Segment
     */
    val DS: Register = Register(16)
    /**
     * Stack Segment
     */
    val SS: Register = Register(16)
    /**
     * Extra Segment
     */
    val ES: Register = Register(16)

    /**
     * Instruction Pointer/Program Counter
     */
    val IP: Register = Register(16)

    /**
     * Status Register aka FLAGS
     */
    val SR: Register = Register(16)
}