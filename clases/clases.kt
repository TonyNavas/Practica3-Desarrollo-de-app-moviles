class impresosaHola(var tam:Int)
{
    fun imprimirHola()
    {
        println("Hola")
    }
}
fun main ()
{
    val impresora = impresosaHola(3)

        println(impresora.tam)
        impresora.imprimirHola()
}