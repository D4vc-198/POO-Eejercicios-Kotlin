open class Vehiculo(val marca: String, val modelo: String, val anio: Int) {

    open fun mostrarDetalles() {
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("Año: $anio")
    }
}

class Choche(
    val marcaCoche: String,
    val modeloCoche:String,
    val anioCoche:Int,
    val tipoCombustible: String) :
    Vehiculo( marca = marcaCoche, modelo = modeloCoche, anio = anioCoche ) {

    override fun mostrarDetalles() {
        super.mostrarDetalles()
        println("Combustible: $tipoCombustible")
    }
}

fun main() {
    val coche = Choche("CHEVROLET", "Chevrolet Onix", 2022, "Gasolina")

    coche.mostrarDetalles()
}