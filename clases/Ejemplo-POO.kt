interface Forma
{
    fun area(): Double
    fun printname();
}

open class Cir(public val nombre: String,public val radio:Double): Forma{
    override fun area() = Math.PI * Math.pow(radio,2.0)
    override fun printname(){}
}
fun main()
{
    var circulo = Cir("circulo", 4.0)
    println(circulo.nombre)
    println(circulo.radio)
    println(circulo.area())
}