fun main(){
    var var1 = 10;
    var var2 = 20;
    var var3 = 30;
    val arr = arrayOf(var1, var2, var3);
    var words:Array<String> = arrayOf("hi", "hello", "bonjour");
    words[0] = "hell";
    println(words.joinToString());

    val addThree = arrayOf(arrayOf(1, 2, 3), arrayOf(5, 5, 6), arrayOf(8, 9, 10));


    val ac = addThree[0];
    println(ac);
    val arr1 = Array(5) {i -> i*i};
    println(arr1.joinToString());

    for(i in words){ //print array using for loop
        print(i+" ");
    }
println();
    //for each function using lambda function
    words.forEach {word -> println(word)};

    if(words.isEmpty()){
        println("is empty");
    } else {
        println(words.first());
        println(words.last());
        println(words.size);
    }
}