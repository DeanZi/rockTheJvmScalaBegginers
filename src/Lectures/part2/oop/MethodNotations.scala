package Lectures.part2.oop

import scala.language.postfixOps

object MethodNotations extends App{

  class Person (val name: String, favoriteMovie : String, val age :Int = 0){
    def +(str : String) :Person = new Person(name + s" ($str)",favoriteMovie)
    def unary_+ :Person = new Person(name, favoriteMovie, age + 1)
    def learns (language : String) = s"$name learns $language"
    def learnsScala = this learns("Scala")
  }

val Mary = new Person("Mary", "Fight Club", 4)
val maryNickName = Mary +"The hottie"
println(maryNickName.name)
val maryAfterBirthDay = +Mary
println(maryAfterBirthDay.age)
  println(Mary learnsScala)
}
