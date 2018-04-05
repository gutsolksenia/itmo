package ru.itmo.ctddev.sorokin.parsing.pfunc

import java.nio.file.Paths

fun main(args: Array<String>) {
    val input = Paths.get(args.getOrNull(0) ?: "sandbox/default.pfunc")
    val output = Paths.get(args.getOrNull(1) ?: "sandbox/src/default.kt")

    val model = Parser().parse(input.toFile().inputStream())
    Generator(model).generate(output.toFile().outputStream())
}