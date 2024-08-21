fun main() {
    val amount: Int = readLine()!!.toInt()
    val member = true
    if(amount > 1000){
        if(member == true) {
            println("Congrats! you got a 20% discount on your purchase")
        } else {
            println("Congrats! you have got a 10% discount")
        }
    } else {
        println("We are sorry but you are not eligible for the discount. Make a purchase of more than $1000 to be eligible for a 20% discount")
    }
}