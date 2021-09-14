import kotlin.math.PI

//POLYMORPHISM said parent can hold reference to its child
//parent can call methods of child classes (which are common)
//Polymorphism kehta h k jaise hm n child class (square or circle) k object banaye hein main function m.
//hm parent class ko b reference use kr skta hun
//reference to hamra parent class ka hoga
//magar usm jo object hongay wo hamaray child class k hongay

fun main ()
{
  //  val circle : Shape.Circle = Shape.Circle(4.0)       //is m hm n object bnaya or = equal k bad constructor circle ka
 //   val square : Shape.Square = Shape.Square(4.0)      //is m hm n object bnaya or = equal k bad constructor circle ka

    val circle : Shape = Shape.Circle(4.0) //is m hm n object bnaya or = equal k bad constructor circle ka
    val square : Shape = Shape.Square(4.0) //is m hm n object bnaya or = equal k bad constructor circle ka

    val shapes = arrayOf(Shape.Circle(3.0), Shape.Square(3.0), Shape.Triangle(3.0, 4.0))
    calculateArea(shapes)
}

fun calculateArea (shapes: Array<Shape>) //y method hai. is m shapes ka array pass kiya hm n
{
    for (shapes in shapes)
    {
        println(shapes.area())
    }
}


open class Shape () // y hamari parent class hai
{
    open fun area(): Double
    {
        return 0.0
    }

class Circle (val radius: Double): Shape() // y child class h
{
    override fun area(): Double {  //override isse lye q k y inherit ho rhe parent class s
        return Math.PI * radius * radius
    }
}

class Square (val side: Double): Shape()
{
    override fun area(): Double {
        return side * side
    }
}

class Triangle (val base: Double, val height: Double) : Shape()
{
    override fun area():Double
    {
        return 0.5 * base * height
    }
}

}