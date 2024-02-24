
val prop_modificavel : String = "modificavel"

fun interpolacao_string_com_variavel(texto: String): String {
  return "ola $texto"
}

fun hello(): String {
  return "Hello Word"
}

fun main() {
  // println(hello())
  println(interpolacao_string_com_variavel(prop_modificavel))
}
