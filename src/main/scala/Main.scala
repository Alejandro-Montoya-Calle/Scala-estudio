object ParImpar {
  def main(args: Array[String]): Unit = {
    // Solicitar al usuario que ingrese un número
    println("Por favor, ingresa un número entero (distinto de 0):")
    var numero = scala.io.StdIn.readInt()

    // Verificar si el número ingresado es par, impar o igual a 0
    while (numero == 0) {
      println("Por favor, ingresa un número diferente de 0:")
      numero = scala.io.StdIn.readInt()
    }

    if (numero % 2 == 0) {
      println(s"$numero es un número par.")
    } else {
      println(s"$numero es un número impar.")
    }
  }
}

