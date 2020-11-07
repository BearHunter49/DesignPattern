package composite

fun main() {
    val root = Directory("Root")
    val file1 = File("File1")
    val file2 = File("File2")

    root.addChild(file1)
    root.addChild(file2)

    val folder1 = Directory("Folder1")
    val file3 = File("File3")

    folder1.addChild(file3)
    root.addChild(folder1)

    root.showChildren()
}