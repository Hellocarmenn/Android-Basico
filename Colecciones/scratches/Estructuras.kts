//if como expresiòn
val calificacion = 8.5
val  status : String  = if  (calificacion==0.0 || calificacion>0){
    "NP"
}else if(calificacion>6.0){
    "Reprobado"
}else{
    "Aprobado"
}

println(status)



val nombre = ""
//metodo que nos dice si esta vacio la cadena o no
val clasificacion = if (nombre.isEmpty()){
    "No tienes un nombre todavia, nombre vacio"
}else if (nombre.length>6) {
    "Nombre largo"
}else{
    "Nombre Corto"
}
println(clasificacion)



val colorName =  "Morado"
val mensajeCalido = "Se considera color calido "
val mensajeFrio =  " Se considera color frio"

when(colorName){
    "Verde" ->{
        println("El $colorName surge de mezclar el amarillo y azul  ")
        println(mensajeFrio)
    }
    "Morado"-> println("El $colorName surge de mezclar azul  con rojo")
    else -> println("Mi programaciòn  aun no sabe el color $colorName")
}


/**
 * Códigos de respuesta HTTP:
 *
Respuestas informativas (100–199),
Respuestas satisfactorias (200–299),
Redirecciones (300–399),
Errores de los clientes (400–499),
y errores de los servidores (500–599).
 */

// INICIO de clase

//var variable inmutable

val code = 404
when(code){
    in 100..199->{
        println("Respuesta Informativa")
    }
    in 200..299 –> println("Respuesta satisfactoria")
    in 300..399 -> println("Redireccion")
    in 400..499 ->("Error del Cliente")
    in 500..599 ->("Error del servidor")

}

var rango = 10 downTo 0 step 2
val rango = 10..0

val rango = 'a'..'z'

//Estructuras
/*while(condicion){
    //acciones
*/


/*
do{
    //acciones
}(condicion)
*/


/*
for(i in <rango>){
   //acciones
 }
 */


/*
for (item in coleccion){
    //acciones
}

coleccion.forEach{it  ->//elemento->(Funcion lamda)
    //acciones por cada elemento de la coleccion

}

coleccion.forEachIndexed{ index,item ->//podemos acceder al indice
      //acciones con acceso a su indice
}

 */