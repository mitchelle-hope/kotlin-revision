
    //invoking a function that will print out hello+ name
    fun main(){
        greeting()
        modulus(10,3)
        addition(40,70,7,6)
         interesting()
}
    fun greeting(){
        var name ="mitchelle"
        println("hello " +name)
    }
    //invoke a function that given 2 numbers returns the remainder of their division.
    fun modulus(a:Int,b:Int){
        var modulus =a%b
        println(modulus)
    }
    //create and invoke a function that gives the sum of any given four numbers

    fun addition(a:Int,b:Int,c:Int,d:Int){
        var sum = a+b+c+d
        println(sum)

    }
    //create and invoke a function that prints out an interesting thing about yourself
    fun interesting(){
        println("i love myself")
    }
