
var calificaciones = arrayOf(
    8.2,7.2,6.0,5.9,10.0,9.25,7.89,10.0,9.5
)

println(calificaciones.size)
println(calificaciones[8])
println(calificaciones.get(4))
println(calificaciones.set(7,7.2))
calificaciones.sortedArray().forEachIndexed { index, valor ->
    println("Elemento: ${valor.toString()} con indice $index")
}

val arrayNulos = arrayOfNulls<Int>(5)

arrayNulos.forEach {
    println (it)
}

arrayNulos.set(2,100)

var operacion = arrayNulos[4]?.let { arrayNulos[2]?.plus(it) }
println(operacion)
//hola