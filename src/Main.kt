fun main() {
    var var1 = 10;
    var var2 = 20;
    var var3 = 30;
    val arr = arrayOf(var1, var2, var3);
    var words: Array<String> = arrayOf("hi", "hello", "bonjour");
    words[0] = "hell";
    println(words.joinToString());

    val addThree = arrayOf(arrayOf(1, 2, 3), arrayOf(5, 5, 6), arrayOf(8, 9, 10));


    val ac = addThree[0];
    println(ac);
    val arr1 = Array(5) { i -> i * i };
    println(arr1.joinToString());

    for (i in words) { //print array using for loop
        print(i + " ");
    }
    println();
    //for each function using lambda function
    words.forEach { word -> println(word) };

    if (words.isEmpty()) {
        println("is empty");
    } else {
        println(words.first());
        println(words.last());
        println(words.size);
    }

    val x: Int = 100
    val y: Long = x.toLong()
    println(y)

    var a: String = "101"
    var b: String? = a as? String
    if (b != null) {
        println(b)
    } else {
        print("it is not converted, typeCast unsuccessfully")
    }

//use of When Expression (it's like switch case)
//Expression returns a value, Statement may or may not return a value, eg when is returning a value which is stored in a variable
    val dayOfWeek = 4
    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println("Day of the week: $dayName")

//implement even or odd using when expression
    val ab = 105
    val abb = ab % 2
    val evenOrOdd = when (abb) {
        0 -> "Even"
        1 -> "Odd"
        else -> "unexpected number"
    }
    println("$ab is $evenOrOdd")

//using when as an statement
    val aba = 30
    when {
        aba % 2 == 0 -> println("even")
        aba % 2 != 0 -> println("odd")
        else -> "unexpected number"
    }

    //operators in kotlin
    var ad = 20
    var ade = 30
    var cd = ad * ade
    println("$cd")
    println("${ad + ade}")
    println("${ad > ade}")
    var cde: Boolean = ad > ade
    println("$cde")
    var cdd = ad == ade
    println("$cdd")

    // unary operators ( +a, -a, ++a, --a)
//logical operators (&&, ||, !(not))
    //For loop
    for (i in 1..5) {
        print(i)
    }
    println(" ")


    for (i in 1 until 5) {
        print(i)
    }
    println(" ")

    //reverse loop
    for (i in 5 downTo 1) {
        print(i)
    }
    println(" ")

    //step keyword
    for (i in 10 downTo 1 step 2) {
        print("$i" + " ")
    }
    println(" ")

    //iterating over lists and array
    var array = arrayOf("A", "B", "C", "D", "E")
    for (i in array) {
        println("$i")
    }
    println(" ")

    //another method(listOf method instead of arrayOf) list is stored in different memory location
    var array1 = listOf("A", "B", "C", "D", 100)
    for (i in array1) {
        println("$i")
    }
    println(" ")

    //intArrayOf
    var array2 = intArrayOf(344, 342, 123, 200, 100)
    for (i in array2) {
        println("$i")
    }

    //("Hi", "Hello", 123) print element at index 0 is .. Hi...and same for other indexes
    var array3 = arrayOf("Hi", "Hello", 123)
    for (i in 0 until array3.size) {
        println("element at $i is ${array3[i]}")
    }
    println(" ")

    //indices keyword
    for (i in array3.indices) {
        println("element at $i index is ${array3[i]}")
    }
    println(" ")

    //while loop
    printName("Alok", 21)
    addNums()
    var cel = 35
    CtoF(cel)
    var far = 104
    FtoC(far)
    var arch = xyz()
    arch.intro()
    var nameee = readLine()
    var ageee = readLine()
    println("............. $ageee")
   // var ageeee = ageee.toInt()
    var arc = introduction("$nameee", 21)
    arc.introo()
    var arcc = introduction("alokk")
    arcc.introo()
    var arccc = introduction()
    arccc.introo()

}
    //functions in kotlin
/*syntax - fun 'name'(params): "return type"(no ":" if no return type{
code
return ''
}
 */
fun printName(str: String, age: Int){
    println("my name is $str and i am $age years old")
}
fun addNums(a: Int = 24, b: Int = 54){
    println("sum of $a and $b is ${a+b}")
}
fun CtoF(celcius: Int){
    var farenheit = celcius*(9/5) + 32
    println("Farenheit value is $farenheit °F")
}
fun FtoC(farenheitt: Int){
    var celciuss = (farenheitt - 32)*(5/9)
    println("Celcius value is $celciuss °C ")
}
//clas xyz inside fun intro inside main call class xyz and use fun intro
class xyz{
    fun intro(){
        println("hi my name is Alok")
    }
}
// primary constructor class xyz(a:String = "hi"){}
//secondary constructor
class introduction(name: String, age:Int){
    var name:String = name
    var age: Int = age
    /*constructor(x: String, y: Int){
        this.name = x
        this.age = y
    }*/
    constructor(n: String) : this() { //this() is sending value to the primary constructor
        this.name = n
        this.age = 0
    }
    constructor() : this("ac",56) //this() is sending value to the primary constructor

    fun introo(){
        println("hi my name is $name and i am $age years old")
    }
}
//primary constructor
