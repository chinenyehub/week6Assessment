

fun main() {
    println(lover(4, 4))
    println(lover(3, 11))
    println(lover(22, 17))

}

fun lover(love1: Int, love2: Int): Boolean {
    return love1 % 2 !== love2 % 2;
}
