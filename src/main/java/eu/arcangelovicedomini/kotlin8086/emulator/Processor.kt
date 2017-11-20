package eu.arcangelovicedomini.kotlin8086.emulator

class Processor {
    var A: Registry = Registry()
    var B: Registry = Registry()
    var C: Registry = Registry()
    var D: Registry = Registry()
    var E: Registry = Registry()
    var pc: ProgramCounter = ProgramCounter()
}