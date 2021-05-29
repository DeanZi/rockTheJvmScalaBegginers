package Lectures.part2.oop

object MethodNotations extends App{
  class Person (val name: String, favoriteMovie : String, val age :Int = 0){
    def +(str : String) :Person = new Person(name + s" ($str)",favoriteMovie)
    def unary_+ :Person = new Person(name, favoriteMovie, age + 1)
}

val Mary = new Person("Mary", "Fight Club", 4)
val maryNickName = Mary +"The hottie"
println(maryNickName.name)
  println(+Mary.age)
}
