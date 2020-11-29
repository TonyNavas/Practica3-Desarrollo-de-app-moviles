class Estudiante(nombre:String, apellido:String,
var asignatura:String,
 var profesor:String):
 Persona(nombre,apellido)

 open class Persona(internal var nombre:String,public  var apellido:String)
 fun main()
 {
     var estudiante = Estudiante("Geronimo", "Navas", "AppMoviles", "yesser")
     println("Nombre: ${estudiante.nombre} ${estudiante.apellido}")
 }