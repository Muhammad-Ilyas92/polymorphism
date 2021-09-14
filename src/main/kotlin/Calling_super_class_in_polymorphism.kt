// INTRO METHOD CALLING
//how compiler identify mjhy method kese call krna  ?
// hamare pass 3 classes hein un 3 classes m kuch method hein (1.Any -> 2.Shape -> 3.Circle)
//ANY CLASS super class hoti hai, mtlb jtne b class hein unki super class
//circle class m kuch method us k apne hein kuch ShAPE class s inherit huwe is mein
// mein n circle class ka aik object bnaya to uska aik method call kiya ab chunkay object jo h wo circle type ka hai to wo sb s pehele circle k andr check krega
//k kya wo method is k andr to nh h phr wo parent class m check krega (super class) k is m to nh h, then isse trhan shape ki super class ( ANY CLASS )M jayega

fun main ()
{
   val circle = Circle(4.00)
    println(circle.toString())  // is m huwa kya is n sb s pehle circle class m check kiya k toString method hai , to is m nh hai , phr is n check kiya parent class m
    //to us m to String hai to us n method ko call kiya or yaha print kiya
}

open class Shape2 ()
{
    open fun area(): Double=0.0
    override fun toString(): String {  //jaise he hm n toString lkha to y default ANY CLASS ko call krega agar hm y line delete kr dengay
        return "I AM SHAPE"
    }
}
 
class Circle (val radius: Double): Shape2()
{
    override fun area(): Double= Math.PI * radius * radius
}