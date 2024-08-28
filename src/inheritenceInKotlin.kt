//find areas
open class rectangle(x: Double, y: Double){
    //func to find area of rectangle and to return
    var length: Double = x
    var breadth: Double = y
 fun area(): Double{
     return length*breadth
 }
    open fun displayArea(){
        println("Area of rectangle with dimentions $length and $breadth is: ${area()}")
    }

    //func to print area "Area of rectangle with dimentions x and y is: (print value returned from func area)
}
fun main(){
    //var m: Double = 20.0

    var a = rectangle(20.0, 30.0)
    a.displayArea()
    var b = square(50.0)
    b.displayArea()
}
class square(var s : Double): rectangle(s, s){//we need to give some parameters to rectangle constructor so we gave s
    override fun displayArea(){
        println("Area of square with dimentions $s is: ${area()}")
    }
}