package com.courseera

object AnonymousFunc {

  def main(args: Array[String]) {

    var x = 1
    println(x)

    //Assigning Function definition to a variable
    var k = (x: Int) => x + 1

    //This function needs an argument and hence providing.
    var l = k(x)
    println(l)

    var inc = new Function1[Int, Int] {
      def apply(x: Int): Int = x + 1
    }

    x = 10
    println("Second Option")
    l = inc(x)
    println(l)
  }

}