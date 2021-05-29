package Lectures.part2.oop

object OOBASICS extends App {

  val dean = new Writer ("Dean", "Zion", 1991)
  val scalaNoteBook = new Novel("ScalaNotes", 2021, dean)
 // println(scalaNoteBook.isWrittenBy)
  val newBook = scalaNoteBook.copy(2022)
 // println(newBook._2)

  val counter = new Counter(8)
  counter.increment
  counter.increment(1)
  class Writer (firstName : String, surName : String, val yearOfBirth : Int){
    def fullName () : String =
      s"Writers name is: $firstName $surName"
  }
  class Novel (name: String, yearOfRelease : Int, author : Writer){

    def authorAge : Int = 2021 - author.yearOfBirth
    def isWrittenBy(author :String) = author == this.author
    def copy(newYearOfRelease : Int) :Novel = new Novel(name, newYearOfRelease, author)
  }


  class Counter (val value : Int){

    def increment = new Counter(value + 1)
    def increment (amount : Int) = new Counter(value + amount)
  }
}
