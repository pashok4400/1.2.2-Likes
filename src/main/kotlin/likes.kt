fun main() {
    var likes = 62
    val res = if (likes % 100 == 11 || likes % 10 != 1) "людям" else "человеку"
    println("Понравилось $likes $res")
}