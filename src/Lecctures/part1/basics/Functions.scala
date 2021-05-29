package Lecctures.part1.basics

import scala.annotation.tailrec

object Functions extends App {

  // instead of loops use recursion

  def function (x: Int)=
    "the number is " + x


  def recursiveFunction (x: Int) :String={
    if (x==1) "thats is it"
    else "number is "+ x +" "+  recursiveFunction(x-1)

  }

  def greetingFunction (name: String, age: Int) =  "Hi! my name is " + name + " and I am "+ age + " years old"
  def factorial (number : Int) : Int = if (number == 1) 1 else factorial(number-1)* number
  def fibonnaci (number : Int) : Int = if (number == 1 || number == 2) 1 else fibonnaci(number - 1) + fibonnaci(number-2)

 // println (fibonnaci(5))

  def checkIfIsPrime (number : Int) :Boolean = {
    val sqrtOfNumber : Double = math.sqrt(number)
    @tailrec
    def checkIfThereDividorsUptoSqrt (dividor : Double) :Boolean= {
      if (dividor > sqrtOfNumber || number == 1 || number == 2) true
      else if (number % dividor == 0) false
      else checkIfThereDividorsUptoSqrt(dividor + 1)
    }

    checkIfThereDividorsUptoSqrt(2)
  }

  println (checkIfIsPrime(2003))
}
