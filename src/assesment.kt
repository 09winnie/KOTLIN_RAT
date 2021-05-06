fun main() {
introduction("Grace Mugendi",23)
    println(dispense(20))
    println(dispense(12))
    println(dispense(4))
    println(character(arrayOf("Lavign","Melante","Jackiah","Mellisah","Nia","Lexx","Bee","Tiff")))
    println(product(55,10))
    println(divide(750,50))
    println(module(51,6))
    var human=Human("Joy",35,57)
    println(human.eat(3))
    println(human.speak("I love going for nature walks."))

    println(comparison(14,16))


}
fun introduction(name:String,age:Int){
    println("My name is $name and I am $age years old.")
}
fun dispense(age:Int){
if(age<6){
    print("Serve a glass of milk")
}
    else if(age>6 && age<15){
        print("Serve a bottle of fanta")
    }
    else{
        print("serve CocaCola")
    }

}
fun character (names:Array<String>):Int{
    var count=0
    for(items in names){
        if (items.count()>4){
            count++
        }}
    return count
}
fun product(a:Int,b:Int):Int{
    return a*b
}
fun divide(a:Int,b:Int):Int{
    return a/b
}
fun module(a:Int,b:Int):Int{
    return a%b

}
class Human( name:String, age:Int, weight:Int){
    fun eat(foodWeight:Int){

        print("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
    }
    fun birthday(){

    }


}
fun comparison(x:Int,y:Int):Int{
    if (x<y){
        return x
    }
    else{
        return y
    }

}
//fun players(){
//    var guess=arrayOf("rock","paper","scissorss")
//    if(guess==guess[1]){
//        print("win")
//    }
//}
fun names(name:Array<String>):String{
    return arrayOf($name)
}
