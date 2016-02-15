package com.courseera

object ArraysExample {

  def main(args: Array[String]) = {

    //One way to define an array
    val x: Array[String] = new Array[String](5)
    x(0) = "One"
    x(1) = "two"
    x(2) = "three"
    x(3) = "four"

    //printing it
    for (i <- 0 to 3) {
      println(x(i))
    }

    //Another way to define an array

    val y = new Array[String](10)
    y(0) = "One"
    y(1) = "two"
    y(2) = "three"
    y(3) = "four"

    //printing it
    for (i <- 0 to 3) {
      println(y(i))
    }

    //Multi dimensional Arrays 3 X 3 Matrix
    println("Multi Dimensional Array")
    
    var matrix = Array.ofDim[String](3, 3)

    println("Inserting the values")
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        matrix(i)(j)= i + "-" + j
      }
    }
    
    println("Printing the values in multi dimensional array")
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        println(matrix(i)(j))
      }
    }
    
    //String to Array
    
    var a = "Hello World".toArray
    
    for(i <- 0 to a.length){
      println(a(i))
    }
    
    
    
  }
}