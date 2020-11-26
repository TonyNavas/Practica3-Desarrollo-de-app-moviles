// class Persona{
//     var nombre:String = ""
//     var apellido:String = ""
//     constructor(){
//     }
//     constructor(n:String, a:String):this()
//     {
//     nombre=n
//     apellido=a
//     }
//    }
class Persona(var nombre:String, var apellido:String)

   fun main()
   {
    var persona = Persona("Geronimo","Navas")
    var nueva = Persona()
    nueva.nombre = "Tony"
    nueva.apellido = "Olivas"

    println(persona.nombre)
    println(nueva.nombre)
   }
   