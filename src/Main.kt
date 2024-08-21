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
    val dayName = when(dayOfWeek) {
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
    val abb = ab%2
val evenOrOdd = when(abb){
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
}