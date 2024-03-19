fun main() {
    var a = 30
    var b = 20
    var sum = a + b
    var difference = a-b
    var product = a * b
    var quatient = a / b
    println(sum)
println(difference)
    println(product)
    println(quatient)
    //
    var length = 20
    var weight = 10
    var area = length * weight
    println(area)
    //
    var name = "Cythia"
    var age = 20
    var color ="blue"
    var result = "My name is $name am $age years old my favourite $color"
    println(result)
    //
    fun isEven(num:Int):Boolean{
        var number = num %2
        if (number ==0){
            println(true)
        }
        else{
            println(false)
        }
    }
}