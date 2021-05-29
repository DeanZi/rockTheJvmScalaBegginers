package Lecctures.part1.basics

import scala.annotation.tailrec

object Recursion extends App {
  @tailrec
  def concatenate (s: String, accumlator: String, n: Int) : String =
    if (n==1) s + accumlator
    else concatenate(s,s+accumlator, n-1)
0
  def fibonacci (n: Int) : Int = {
    def tailRecFibo (t: Int, acc1: Int, acc2: Int) : Int =
      if (t >= n) acc1
      else tailRecFibo(t+1, acc1 + acc2, acc1)

    if (n<=2) 1
    else tailRecFibo(2,1,1)
  }


  //println(concatenate("dean", "", 5))
  println(fibonacci(8))


}
