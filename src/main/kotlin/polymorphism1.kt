// poly means many and morphism means forms
// aik method banayen or wo different behave kre or us k many forms hoti hein based on object
//aik he method us k different forms
//polymorphism says jahan ap k parent class ka object tha wahen ap child class ka object bs pass kr skte hien

import kotlin.math.PI

fun main ()
{

    val shape = Shape1() //parent class ( shape class ka object)
       printArea(shape)

    val square = Shape1.Square1(4.0)  //square child class hai yani sub class hai (square class ka object)
    printArea(square)

}

fun printArea (shape: Shape1) //y method banaya h jis m shape1 name ka
{
    println(shape.area())
}


open class Shape1 () {  //parent class
    open fun area(): Double {
        return 0.0
    }


    class Circle1(val radius: Double) : Shape1()  //child class
    {
       override fun area(): Double = Math.PI * radius * radius

    }

    class Square1(val side: Double) : Shape1() //child class
    {
      override  fun area(): Double {
            return side * side
        }
    }

    class Triangle1(val base: Double, val height: Double) : Shape1()  //child class
    {
      override  fun area(): Double {
            return 0.5 * base * height
        }
    }
}
