package com.courseera

object IfElseExample {

  def main(args: Array[String]) {

    var x = 25

    if (x == 10) {
      println("Value of X is 10")

    } else {

      println("The vlaue of x is not 10")
    }

    //if else if 

    if (x == 10) {
      println("Value of X is 10")
    } else if (x < 10) {
      println("X is less thatn 10")
    }else{
      println("The Value of X is greater than 10")
    }   
    
    
  }

}