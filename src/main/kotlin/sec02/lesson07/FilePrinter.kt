package sec02.lesson07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    val printer: FilePrinter = FilePrinter()

    printer.readFile()
}

class FilePrinter {
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}