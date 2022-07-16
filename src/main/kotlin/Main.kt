fun main() {
    println("Hello World!")
    var nome = "Matheus"
    println(nome)
    println("${soma(5, 8)}")
    println("${fatorial(5)} ")

}

fun soma(a:Int, b:Int):Int{
    return a + b
}

fun fatorial(num:Int):Int{
    var fat:Int = num
    var len:Int = num

    while(len > 1) {
        len -= 1
        fat *= len
    }
    return fat
}

